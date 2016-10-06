package boletín.pkg2.pkg11;

import javax.swing.JOptionPane;

public class Boletín211 {

    public static void main(String[] args) {
        
                        float sueldoF, tiempo, ventas, distancia;
        
        final int COMISION = 5, EUROSKM = 2, DIETAS = 30;
        
        sueldoF = Float.parseFloat(JOptionPane.showInputDialog("El sueldo fijo es de:"));
        tiempo = Float.parseFloat(JOptionPane.showInputDialog("Días que llevó el desplazamiento:"));
        ventas = Float.parseFloat(JOptionPane.showInputDialog("Número de ventas realizadas:"));
        distancia = Float.parseFloat(JOptionPane.showInputDialog("Distancia en kilometros recorrida:"));
        
        JOptionPane.showMessageDialog(null,"El sueldo líquido de " + sueldoF + "€ de sueldo fijo, " + distancia + "km recorridos, en " + tiempo + " días y " + ventas + " ventas realizadas es igual a " + (float)(sueldoF + ventas*COMISION/100 + EUROSKM*distancia + DIETAS*tiempo) + "€." );
    }
    
}
