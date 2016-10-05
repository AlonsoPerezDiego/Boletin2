/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg2.pkg6;

import javax.swing.JOptionPane;

/**
 *
 * @author dalonsoperez
 */
public class Boletín26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         System.out.println("Para calcular el descuento realizado en cierto producto introduce:");
         
        double precioOriginal;
        double precioFinal;
        
        precioOriginal = Double.parseDouble(JOptionPane.showInputDialog("El precio original del producto era: "));
        precioFinal = Double.parseDouble(JOptionPane.showInputDialog("El precio final del producto es: "));
        
         System.out.println("El porcentaje descontado de los " + precioOriginal + "€ originales del producto es " + (100 - precioFinal * 100 / precioOriginal) + "%");
    }
    
}
