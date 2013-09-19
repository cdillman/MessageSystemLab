/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Corbin
 */
public class StartUp {
    
    
    public static void main(String[] args) {
        MessageService mesServ = new MessageService();
        CounsoleReader couRead = new CounsoleReader();
        CounsoleWriter couWrite = new CounsoleWriter();
        GuiReader guiRead = new GuiReader();
        GuiWriter guiWrite = new GuiWriter();
        FileReader FilRead = new FileReader();
        FileWriter FilWrite = new FileWriter();
        
        
        mesServ.getMessage(guiRead, guiWrite);
    }
}
