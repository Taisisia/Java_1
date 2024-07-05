package org.example._20240605.taks;

public class Test {
//  public int task =1;
  private int task =1;

    public int getTask () {
      return task;
    }
public void setTask (int task) {
      if (task > 0) {
        this.task = task;
      }
        else {
        System.out.println("Значение должно быть больше 0");
      }
}
}
