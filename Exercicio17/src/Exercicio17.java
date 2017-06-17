import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numeroUm = 0, numeroDois = 0;

		System.out.println("Digite o numerador: ");
		numeroUm = in.nextInt();

		System.out.println("Digite o multiplicador: ");
		numeroDois = in.nextInt();

		System.out.print(numeroUm + " X " + numeroDois + " = ");
		
		imprimirSomaDaMultiplicacao(numeroDois,numeroUm);
		
		System.out.print(" = " + (numeroUm * numeroDois));
	}

	private static String imprimirSomaDaMultiplicacao(int numeroDois, int i) {
		if(i == 0) return "0";
		
		if(i > 1) System.out.print(numeroDois + " + ");
		if(i == 1) System.out.print(numeroDois);
		i--;
		
		return imprimirSomaDaMultiplicacao(numeroDois, i);
	}
}