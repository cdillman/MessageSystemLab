/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import javax.swing.JOptionPane;
/**
 *
 * @author Corbin
 */
public class GuiWriter implements MessageOutput{
    private GuiReader gui;
    private MessageService mess;
    private String message;
    
    
    @Override
    public void writeMessage(){
        message = gui.getMessage();
       if(message == null || message.length() == 0){
           JOptionPane.showInputDialog("Message cannot be null or empty!!!");
       } 
        
        JOptionPane.showInputDialog(message);
    }

    @Override
    public void readMessage() {
        
    }

    
    
    
}
