package org.example.controllers;

import org.example.models.Task;
import org.example.views.TaskView;

import java.util.ArrayList;

public class TaskController {
    private final Task mModel;
    private final TaskView mView;

    public TaskController(TaskView view){
        this.mModel = new Task();
        this.mView = view;
    }

    public void createNewTask(int id, String name){
        mModel.createTask(id, name);
        mView.update();
    }

    public ArrayList<Task> getTaskList(){
        return mModel.getmTaskList();
    }
}
