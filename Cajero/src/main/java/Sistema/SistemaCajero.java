
package Sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Genius Lab
 */
public class SistemaCajero {
    
    // - Variables Locales - 
    public static double saldoActual;
    
    // Constructor
    public SistemaCajero(){
        saldoActual= 0;
    }
    
    // Metodos
    public void depositar(double deposito){
        saldoActual += deposito;
    }
    
    public void retirar(double retiro){
        if(saldoActual >= retiro){
            saldoActual -= retiro;
        }else{
            JOptionPane.showInputDialog(null, "Error! Saldo insuficiente!");
        }
    }
    
    public double obtenerSaldo(){
        return saldoActual;
    }
}
