/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctaahorro;

/**
 *
 * @author FREDY CASTRO
 */
public class RetiroClass {
    private double saldo=0;
    private double retiro=0;
    public void RetiroClass (){
        
    }
    
     public double Retiros(double saldocta, double retirocta) {
        saldo = saldocta;
        retiro = retirocta;
        return saldo - retiro;
    }
    
    
}
