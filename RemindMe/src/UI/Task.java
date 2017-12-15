/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.Serializable;
import javax.swing.JRadioButton;

/**
 *
 * @author s402
 */
public class Task implements Serializable  {

    public Task(){
    
    }
    
    public Task(String TaskDescription, String TaskMessage, JRadioButton btnRadio) {
        this.TaskDescription = TaskDescription;
        this.TaskMessage = TaskMessage;
        this.btnRadio = btnRadio;
    }

    public String getTaskDescription() {
        return TaskDescription;
    }

    public void setTaskDescription(String TaskDescription) {
        this.TaskDescription = TaskDescription;
    }

    public String getTaskMessage() {
        return TaskMessage;
    }

    public void setTaskMessage(String TaskMessage) {
        this.TaskMessage = TaskMessage;
    }

    public JRadioButton getBtnRadio() {
        return btnRadio;
    }

    public void setBtnRadio(JRadioButton btnRadio) {
        this.btnRadio = btnRadio;
    }
    
    private String TaskDescription;
    private String TaskMessage;
    private JRadioButton btnRadio;
}
