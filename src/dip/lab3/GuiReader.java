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
public class GuiReader implements MessageInput{
    private String message;
    
    @Override
    public void readMessage(){
       message = JOptionPane.showInputDialog("Please Enter your Message");
    }

    public String getMessage() {
        return message;
    }
    
    
}
