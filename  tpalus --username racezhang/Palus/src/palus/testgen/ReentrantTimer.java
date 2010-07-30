// Copyright 2010 Google Inc. All Rights Reserved.

package palus.testgen;

import randoop.util.Timer;

/**
 * @author saizhang@google.com (Your Name Here)
 * A timer which is slightly different from the existing ones. It could
 * start multiple times without throwing an exception.
 */
public class ReentrantTimer extends Timer {
  private long startTime;
  private long timeElapsed;
  private boolean running;
  
  private boolean active = true;

  public ReentrantTimer() {
    super();
  }

  public void startTiming() {
    if (this.running)
      return; //the major different
    this.startTime = System.currentTimeMillis();
    this.running = true;
  }
  
  public void setInactive() {
    this.active = false;
  }
  
  public boolean isActive() {
    return this.active;
  }

  public void stopTiming() {
    if (!this.running)
      return;
    this.timeElapsed += System.currentTimeMillis() - this.startTime;
    this.running = false;
  }
}
