import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
        int[] vetor = new int[10];

        pegarValores(vetor, 0);

        int menorValor = vetor[9];

        System.out.println("O menor valor digitado foi: " + pegaMenorValor(vetor, 0, menorValor));
    }

    static int pegaMenorValor(int[] vetor, int i, int valor) {
    	if (vetor[i] < valor) valor = vetor[i];
    	i++;
    	
    	if(i < 10) return pegaMenorValor(vetor, i, valor);
		
		return valor;
    }

    static void pegarValores(int[] vetor, int counter){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o " + (counter + 1) + "° numero: ");
        vetor[counter] = in.nextInt();
        counter++;
        
        if (counter < 10) pegarValores(vetor, counter);
    }
}