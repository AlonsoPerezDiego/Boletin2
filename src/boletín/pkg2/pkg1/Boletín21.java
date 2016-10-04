/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg2.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author dalonsoperez
 */
public class Boletín21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Para calcular el area de un triánguno:");
        
        double base;
        double altura;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Introduce base: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce altura: "));
       
        System.out.println("El area del triángulo de base " + base + "cm y altura " + altura + "cm es igual a " + base * altura/2 + "cm².");
               
             
    }

}
