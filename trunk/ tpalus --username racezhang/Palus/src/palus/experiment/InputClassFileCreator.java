// Copyright 2010 Google Inc. All Rights Reserved.

package palus.experiment;

import randoop.Globals;
import randoop.util.Files;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author saizhang@google.com (Your Name Here)
 *
 */
public class InputClassFileCreator {
  
  /**
   * Get all files recursively from a specific directory 
   * */
  public static List<File> getFilesInDir(String dirPath, String endWith, String nonSub) {
    File dir = new File(dirPath);
    if(!dir.isDirectory()) {
      throw new IllegalArgumentException(dirPath + " is not a directory.");
    }
    //all returned file
    List<File> allFiles = new LinkedList<File>();
    
    List<File> worklist = new LinkedList<File>();
    
    File[] files = dir.listFiles();
    for(File file : files) {
      if(file.isFile() && (endWith == null? true : file.getName().endsWith(endWith))
          && (nonSub == null? true : file.getName().indexOf(nonSub) == -1)) {
        allFiles.add(file);
      }
      if(file.isDirectory()) {
        worklist.add(file);
      }
    }
    
    while(!worklist.isEmpty()) {
      File nextDir = worklist.remove(0);
      File[] filesInDir = nextDir.listFiles();
      for(File fileInDir : filesInDir) {
        if(fileInDir.isDirectory()) {
          worklist.add(fileInDir);
        }
        if(fileInDir.isFile() && (endWith == null? true : fileInDir.getName().endsWith(endWith))
            && (nonSub == null? true : fileInDir.getName().indexOf(nonSub) == -1)) {
          allFiles.add(fileInDir);
        }
      }
    }

    return allFiles;
  }
  
  /**
   * Output pairs in form of "--testclass=packagename.classname"
   * */
  public static String[] getRandoopClassInputsCmd(String dirPath) {
    List<File> files = getFilesInDir(dirPath, ".class", "$");
    String[] retCmd = new String[files.size()];
    for(int i = 0; i < files.size(); i++) {
      String fileName = files.get(i).getAbsolutePath().substring(dirPath.length() + 1);
      fileName = fileName.substring(0, fileName.length() - ".class".length());
      fileName = fileName.replace('/', '.');
      retCmd[i] = "--testclass=" + fileName;
    }
    return retCmd;
  }
  
  /**
   * Output all non-inner non-annoymous class name from a given directory
   * */
  public static void outputClassList(String dirPath, String outputFile) throws IOException {
    List<File> files = getFilesInDir(dirPath, ".class", "$");
    StringBuilder sb = new StringBuilder();
    for(File file : files) {
      String fileName = file.getAbsolutePath().substring(dirPath.length() + 1);
      fileName = fileName.substring(0, fileName.length() - ".class".length());
      fileName = fileName.replace('/', '.');
      sb.append(fileName);
      sb.append(Globals.lineSep);
    }
    Files.writeToFile(sb.toString(), outputFile);
  }
  
  /**
   * A small test driver
   * */
  public static void main(String[] args) throws IOException {
    String dirPath = "/home/saizhang/workspace/tiny-sql-2/bin";
    String outputFile = "/home/saizhang/workspace/tiny-sql-2/bin/tinysqlclass.txt";
    InputClassFileCreator.outputClassList(dirPath, outputFile);
  }
}
