/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Corbin
 */
public class MessageService {
    
    public void getMessage(MessageInput mIn, MessageOutput mOut){
        
        mIn.readMessage();
        mOut.writeMessage();
    }
}
