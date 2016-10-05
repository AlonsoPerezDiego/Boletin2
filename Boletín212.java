/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg2.pkg12.pkg2;


import javax.swing.JOptionPane;

public class Boletín2122 {

    public static void main(String[] args) {
        
                float sueldoF, tiempo, ventas, distancia;
        
        final int COMISION = 5, EUROSKM = 2, DIETAS = 30, IRPF = 18, SS = 36;
        
        sueldoF = Float.parseFloat(JOptionPane.showInputDialog("El sueldo fijo es de:"));
        tiempo = Float.parseFloat(JOptionPane.showInputDialog("Días que llevó el desplazamiento:"));
        ventas = Float.parseFloat(JOptionPane.showInputDialog("Número de ventas realizadas:"));
        distancia = Float.parseFloat(JOptionPane.showInputDialog("Distancia en kilometros recorrida:"));
        
        JOptionPane.showMessageDialog(null,"El sueldo líquido de " + sueldoF + "€ de sueldo fijo, " + distancia + "km recorridos, en " + tiempo + " días y " + ventas + " ventas realizadas, con retención del " + IRPF + "% por el I.R.P.F. y " + SS + "€ por la seguridad social es igual a " + (float)(sueldoF + ventas*COMISION/100 + EUROSKM*distancia + DIETAS*tiempo * (100-IRPF)/100 - SS ) + "€." );
    }
    
}
