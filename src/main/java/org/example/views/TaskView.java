package org.example.views;

import org.example.controllers.TaskController;
import org.example.models.Task;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class TaskView {
    private JPanel panel1;
    private JTextField txtTaskId;
    private JTextField txtTaskName;
    private JButton addTaskButton;
    private JList tasksList;
    private JLabel lbl1;
    private JLabel lbl2;

    private final TaskController mTaskController;

    public TaskView() {
        this.mTaskController = new TaskController(this);

        addTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createNewTask();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TaskView");
        frame.setContentPane(new TaskView().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(880, 380);
        frame.pack();
        frame.setVisible(true);
    }

    private void createNewTask(){
        boolean isValidInputs = false;
        try{
            isValidInputs = !txtTaskId.getText().isEmpty() && Integer.parseInt(txtTaskId.getText()) >= 0 && !txtTaskName.getText().isEmpty();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        if(isValidInputs)
            this.mTaskController.createNewTask(Integer.parseInt(txtTaskId.getText()), txtTaskName.getText());
        else
            System.out.println("Invalid inputs");
    }

    public void update()
    {
        ArrayList<String> strList = new ArrayList<String>();
        for (Task task : mTaskController.getTaskList()) {
            strList.add(task.getmTaskId() + " " + task.getmTaskName());
        }
        tasksList.setListData(strList.toArray(new String[0]));
    }
}
