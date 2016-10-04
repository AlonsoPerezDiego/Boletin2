
package boletín.pkg2.pkg10;

import javax.swing.JOptionPane;

public class Boletín210 {

    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Para saber la cantidad de billetes de 100€, 20€, 5€ y monedas de 1€ introduce:");
        
        double dinero = Double.parseDouble(JOptionPane.showInputDialog("La contidad total de dinero es:"));
        
        JOptionPane.showMessageDialog(null, "Los " + dinero + "€ se puede subdividir en " + (int)(dinero / 100) + " billetes de 100€, " + (int)(dinero % 100 / 20) + " billetes de 20€, " + (int)(dinero % 100 % 20 / 5) + " billetes de 5€, " + (int)(dinero % 100 % 20 % 5) + " monedas de 1€.");
    }
    
}
