/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg2.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author dalonsoperez
 */
public class Boletín24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Procede a introducir dos números para que se realice la suma, la resta, el producto y el cociente");
        
        double numero1;
        double numero2;
        
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer número "));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo número "));
        
         System.out.println("La suma del número " + numero1 + " más el número " + numero2 + " es igual a " + (numero1 + numero2));
         System.out.println("La resta del número " + numero1 + " menos el número " + numero2 + " es igual a " + (numero1 - numero2));
         System.out.println("El producto del número " + numero1 + " multiplicado por el número " + numero2 + " es igual a " + (numero1 * numero2));
         System.out.println("El cociente del número " + numero1 + " dividido entre el número " + numero2 + " es igual a " + (numero1 / numero2));
    }
    
}
