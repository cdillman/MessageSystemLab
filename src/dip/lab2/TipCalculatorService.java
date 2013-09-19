/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author Corbin
 */
public class TipCalculatorService {
    
    
    public double getCalculatedTip(TipCalculator tc){
        if(tc == null) return 0;
        
        return tc.getTip();
    }
}
