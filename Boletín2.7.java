package boletín.pkg2.pkg7;

import javax.swing.JOptionPane;

public class Boletín27 {

    public static void main(String[] args) {
    
    JOptionPane.showMessageDialog(null, "Para calcualar a renda mensual:");
        
    double n, i, t, m;
    
    n = Float.parseFloat(JOptionPane.showInputDialog("O nominal é:"));
    i = Float.parseFloat(JOptionPane.showInputDialog("O interese anual en tanto por cento é:"));
    t = Float.parseFloat(JOptionPane.showInputDialog("O tempo en anos é:"));
    i = i/1200;
    m = Math.pow((1+i), (t*12));
    
    JOptionPane.showMessageDialog(null, "A renda mensual é de " + (n * m * i / (m - 1) ) + "€.");
    }
    
}
