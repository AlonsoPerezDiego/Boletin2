/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg2.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author dalonsoperez
 */
public class Boletín23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Para cambiar de euros a dólares");
        float cambio$;
        double euros;
        
        cambio$ = Float.parseFloat(JOptionPane.showInputDialog("El valor actual del dolar respecto al euro es (1$ = X€): "));
        euros = Double.parseDouble(JOptionPane.showInputDialog("La cantidad de euros que se desea cambiar es: "));
        
        System.out.println("El cambio de " + euros + "€ en dólares es igual a " + cambio$ * euros + "$.");
    }
    
}
