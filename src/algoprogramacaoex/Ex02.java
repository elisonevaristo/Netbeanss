/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoprogramacaoex;

public class Ex02 {

    public static void main(String[] args) {

        System.out.println("<<<Menor valor do vetor criado>>>\n");
        int[] vetor = {5, 8, 9, 1, -3, 2, 7};

        int menor = menorValor(vetor);
        System.out.println("Menor número do vetor é : " + menor);
    }

    static int menorValor(int[] vetor) {

        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }
}
