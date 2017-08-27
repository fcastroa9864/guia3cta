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
    double retiro;
    double deposito=0;
    // Constructor con los dos atributos
    public void CuentaDeAhorrosClass(){

      }
 

    public double Retiros(double saldocta, double retirocta) {
        saldo = saldocta;
        retiro = retirocta;
        return saldo - retiro;
        
    }
     public double Depositos(double saldocta, double depositocta) {
        saldo = saldocta;
        deposito = depositocta;
        return saldo + deposito;
    }
     
        public void Extracto(double valor_saldo, double valor_interes){ 
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
