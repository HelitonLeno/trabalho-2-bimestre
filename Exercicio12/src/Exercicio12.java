import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o numero que será gerado a tabuada: ");
		int numero = in.nextInt();
		
		gerarImprimirTabuada(numero, 0);
	}
	
	private static void gerarImprimirTabuada(int numero, int counter) {
		System.out.println(numero + " X " + counter + " = " + (numero * counter));
		counter++;
		
		if (counter <= 10) gerarImprimirTabuada(numero, counter);
	}
}