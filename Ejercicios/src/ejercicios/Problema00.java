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
public class Problema00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                double numero = datos[i][j];
                resultado[i][j] = factorial(numero);
                
            }
        }
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.printf("%.1f\t\n",resultado[i][j]);
            }
        }

    }

    public static double factorial(double numero) {

        if (numero <= 1) { // aquí se evalua el caso base

            return 1; // 0! = 1 
            // 1! = 1
        } else {
            // paso recursivo
            // numero = numero - 1 
            return numero * factorial(numero - 1);

        }

    }

}
