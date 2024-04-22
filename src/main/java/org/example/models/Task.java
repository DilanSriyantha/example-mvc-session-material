package org.example.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task {
    private int mTaskId;
    private String mTaskName;
    private final ArrayList<Task> mTaskList = new ArrayList<Task>();

    public Task()
    {}

    public Task(int mTaskId, String mTaskName) {
        this.mTaskId = mTaskId;
        this.mTaskName = mTaskName;
    }

    public int getmTaskId() {
        return mTaskId;
    }

    public void setmTaskId(int mTaskId) {
        this.mTaskId = mTaskId;
    }

    public String getmTaskName() {
        return mTaskName;
    }

    public void setmTaskName(String mTaskName) {
        this.mTaskName = mTaskName;
    }

    public void createTask(int id, String name) {
        mTaskList.add(new Task(id, name));
    }

    public ArrayList<Task> getmTaskList(){
        return this.mTaskList;
    }
}
