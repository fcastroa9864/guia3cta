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
public class DepositoClass {
    private double saldo=0;
    private double deposito=0;
    public void DepositoClass( ) {
        
    }
    
     public double Depositos(double saldocta, double depositocta) {
        saldo = saldocta;
        deposito = depositocta;
        return saldo + deposito;
    }
}
    
    
