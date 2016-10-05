/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg2.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author dalonsoperez
 */
public class Boletín22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Para calcular el area de un cuadrado:");
        
        double lado;
       
        lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado: "));
        
        System.out.println("El area del cuadrado de lado " + lado + "cm es igual a " + lado * lado + "cm².");

    }
    
}
