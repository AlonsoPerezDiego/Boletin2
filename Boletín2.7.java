package boletín.pkg2.pkg7;

import javax.swing.JOptionPane;

public class Boletín27 {

    public static void main(String[] args) {
    
    JOptionPane.showMessageDialog(null, "Para calcualar el alquiler mensual:");
        
    double n, i, t, m;
    
    n = Float.parseFloat(JOptionPane.showInputDialog("El nominal es:"));
    i = Float.parseFloat(JOptionPane.showInputDialog("El interés anual en tanto por ciento es:"));
    t = Float.parseFloat(JOptionPane.showInputDialog("El tiempo en años es:"));
    i = i/1200;
    m = Math.pow((1+i), (t*12));
    
    JOptionPane.showMessageDialog(null, "El alquiler mensual es de " + (n * m * i / (m - 1) ) + "€.");
    }
    
}
