/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;


/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[] datos = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};

        double[] suma = new double[5];

        for (int i = 0; i < datos.length; i++) {

            suma[i] = obtenerSuma(datos[i], datos2[i]);
        }

        for (int i = 0; i < suma.length; i++) {

            System.out.printf("%.1f\t", suma[i]);
        }

    }

    public static double obtenerSuma(double a, double b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
    }
}
