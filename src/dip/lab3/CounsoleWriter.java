/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Corbin
 */
public class CounsoleWriter implements MessageOutput{
    private String message;
    

    @Override
    public void writeMessage() {
        System.out.println(message);
    }


    @Override
    public void readMessage() {
        
    }
}
