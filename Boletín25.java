/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg2.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author dalonsoperez
 */
public class Boletín25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Para pasar de millas náuticas a metros introduce:");
        
        final float Millas_Metros = 1852;
        double millasNauticas;
        
        millasNauticas = Double.parseDouble(JOptionPane.showInputDialog("Las millas que se quíeren pasar a metros: "));
        
        System.out.println("Las " + millasNauticas + "millas náuticas en metros son " + millasNauticas * Millas_Metros + "m.");
    }
    
}
