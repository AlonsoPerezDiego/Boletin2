
package boletín.pkg2.pkg8;

import javax.swing.JOptionPane;


public class Boletín28 {

    public static void main(String[] args) {
        
        double celsius;
        
        JOptionPane.showMessageDialog(null, "Para realizar la conversión de grados Celsius a Fahrenheit y Kelvin introduce:");
        
        celsius = Double.parseDouble(JOptionPane.showInputDialog("La temperatura en grados celsius que deseas convertir es:"));
       
        JOptionPane.showMessageDialog(null, "Los grados Fahrenheit equivalentes a " + celsius + "ºc es igual a " + (32 + 9/5 * celsius ) + "ºF." );
        JOptionPane.showMessageDialog(null, "Los Kelvin equivalentes a " + celsius + "ºc es igual a " + (273 + celsius ) + "K." );
        
    }   
}
