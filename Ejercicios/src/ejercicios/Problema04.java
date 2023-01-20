/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author reroes
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};
        int[] datofinal = new int[6];

        for (int i = 0; i < dataInicial.length; i++) {
            int v = NumberUtils.toInt(dataInicial[i], 0);
            datofinal[i] = v;
            System.out.println(datofinal[i]);

        }

        // int[] dataFinal = {100, 90, 0, 10, 0, 0};
    }

}
