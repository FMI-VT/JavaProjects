/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Stefan
 */
public class Model implements Serializable {
    ArrayList<Task> tasks = new ArrayList<Task>();

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }
    
    public void add(Task newTask) {
        tasks.add(newTask);
    }
}
