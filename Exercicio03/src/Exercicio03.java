import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Integer[] vetor = new Integer[10];

        int soma = pegarValores(vetor, 0, 0);

        System.out.println("A soma dos valores é: " + soma);
    }

    private static Integer pegarValores(Integer[] vetor, int counter, int soma){
        Scanner in = new Scanner(System.in);

        if (counter == 10) return soma;

        System.out.println("Digite o " + (counter + 1) + "° numero: ");
        vetor[counter] = in.nextInt();
        
        soma += vetor[counter];

        return pegarValores(vetor, ++counter, soma);
    }
}