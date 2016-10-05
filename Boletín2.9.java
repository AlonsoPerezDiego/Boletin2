
package boletín.pkg2.pkg9;

import javax.swing.JOptionPane;

public class Boletín29 {

    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Para saber la cantidad total de dinero, introduce el número que posee de cada uno de los siguietes billetes y monedas.");
        int n100, n20, n5, n1;
        
        n100 = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de billetes de 100€:"));
        n20 = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de billetes de 20€:"));
        n5 = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de billetes de 5€:"));
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de monedas de 1€:"));
        
        JOptionPane.showMessageDialog(null, "La cantidad de dinero total en función de los datos introducidos es igual a " + (n100 * 100 + n20 * 20 + n5 * 5 + n1) + "€.");
        
    }
    
}
