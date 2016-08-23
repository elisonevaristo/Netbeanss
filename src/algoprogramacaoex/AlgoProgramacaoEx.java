/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoprogramacaoex;

import java.util.Scanner;

public class AlgoProgramacaoEx {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite a(" + (i + 1) + "º) posição do vetor: ");
            array[i] = read.nextInt();
        }
        try {

            readVetor(array);
        } catch (Exception e) {
            System.out.println("\nFIM Execução");
        }
    }

    static int[] readVetor(int[] array) {

        int aux[] = new int[10];

        for (int i = 0; i < aux.length; i++) {

            if (array[i] % 2 == 0) {
                System.out.println("Par: " + (aux[i] = 0));
            } else {
                aux[i] = 0;
                System.out.println("Impar: " + (aux[i] = 1));
            }
        }
        return aux;
    }

}
