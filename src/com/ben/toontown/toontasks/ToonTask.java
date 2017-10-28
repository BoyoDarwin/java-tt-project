package com.ben.toontown.toontasks;

/**
 * Created by ben on 3/26/17.
 */
public class ToonTask {

    private String taskTitle;
    public String getTaskTitle(){ return this.taskTitle; }
    public void setTaskTitle(String taskTitle) { this.taskTitle = taskTitle; }

    private int taskID;
    public int getTaskID() { return taskID; }
    public void setTaskID(int taskID) { this.taskID = taskID; }


    public ToonTask(String taskTitle, int taskID){
        this.taskTitle = taskTitle;
        this.taskID = taskID;
    }


}
