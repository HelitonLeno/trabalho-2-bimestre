/*
    Crie um algoritmo que dado um número n, gere todas as possíveis combinações,
      com as n primeiras letras do alfabeto.
      Ex.: n = 3. Resposta: ABC, ACB, BAC, BCA, CAB, CBA.
 */

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("Digite o numero de letras para a combinação: ");
        int tamanhoLetras = in.nextInt();

        // --- Pega N digitado das primeiras  letras e atribui ao alfabeto ---
        alfabeto = alfabeto.substring(0, tamanhoLetras);

        // --- imprimir as combinacoes com N letras ---
        imprimirCombinacao("", alfabeto);
    }

    /**
        Cada vez que a funcao roda, retira uma letra, faz uma concatenação com a @var auxiliar
        e faz uma permuta com a sobra das letras.

        @param auxiliar
        @param alfabeto
     */
    private static void imprimirCombinacao(String auxiliar, String alfabeto) {

        if (alfabeto.length() <= 1) System.out.println(auxiliar + alfabeto);

        if (alfabeto.length() > 1){
            for (int i = 0; i < alfabeto.length(); i++) {
                String primeiraLetra = alfabeto.substring(i, i + 1);
                String antesDaPrimeiraLetraAtual = alfabeto.substring(0, i);
                String restoDasLetras = alfabeto.substring(i + 1);

                imprimirCombinacao(auxiliar + primeiraLetra, antesDaPrimeiraLetraAtual + restoDasLetras);
            }
        }
    }
}
