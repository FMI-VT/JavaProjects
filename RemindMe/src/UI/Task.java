/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author s402
 */
public class Task implements Serializable  {
    private String taskDescription;
    private String taskMessage;
    private Date taskDate;    
    private Integer taskPriority;
    private Boolean isReminded;
    
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    public Task(){
    }
    
    public Task(String taskDescription, String taskMessage, Integer taskPriority, int minutes, int seconds) {
        this.taskDescription = taskDescription;
        this.taskMessage = taskMessage;
        this.taskPriority = taskPriority;
        
        this.taskDate = new Date(new Date().getTime() + (minutes * 60000) + (seconds * 1000));
        this.isReminded = false;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskMessage() {
        return taskMessage;
    }

    public void setTaskDate(Date taskDate) {
        this.taskDate = taskDate;
    }

    public void setIsReminded(Boolean isReminded) {
        this.isReminded = isReminded;
    }

    public void setTaskMessage(String taskMessage) {
        this.taskMessage = taskMessage;
    }
    
    public Integer getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(Integer taskPriority) {
        this.taskPriority = taskPriority;
    }
    
    public Date getTaskDate() {
        return taskDate;
    }

    public Boolean getIsReminded() {
        return isReminded;
    }

    @Override
    public String toString() {
        String priorityName = taskPriority == 1 ? "High" : taskPriority == 2 ? "Medium" : "Low";
        
        //return "'" + taskMessage + "' on " + dateFormat.format(taskDate) + " with " + priorityName + " priority, isReminded=" + isReminded;
        return "'" + taskMessage + "' on " + dateFormat.format(taskDate) + " with priority " + taskPriority + ", isReminded=" + isReminded;
    }    
}