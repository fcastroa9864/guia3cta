/*
 * 
 * 
 */
package ctaahorro;

/**
 *
 * @author FREDY CASTRO
 */
public class CuentaDeAhorrosClass {
    double saldo;
    double interes;
    double rentabilidad=0;
    // Constructor con los dos atributos
    public void CuentaDeAhorrosClass(double valor_saldo, double valor_interes){
        rentabilidad=0;
        saldo = valor_saldo;
        interes = valor_interes;
     for(int i=0;i<12;i++) {
         rentabilidad = saldo * interes /100;
         saldo = saldo + rentabilidad;
         System.out.println("Mes "+i);
         System.out.println("Rentabilidad : "+rentabilidad);
         System.out.println("Saldo :"+saldo);
         

     }
        
    }
  
    
}
