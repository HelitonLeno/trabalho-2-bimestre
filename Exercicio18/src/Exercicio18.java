import java.util.Scanner;

public class Exercicio18 {
	
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		System.out.println("Digire o valor do capital: ");
		double capital = in.nextDouble();
		
		System.out.println("Digite a taxa % de emprestimo : ");
		double taxa = in.nextDouble();
		
		System.out.println("Quantos meses deseja simular? : ");
		int periodo = in.nextInt();
		
		imprimirJuros(capital, taxa, periodo, 1);
	
	}

	private static void imprimirJuros(double capital, double taxa, int periodo, int i) {
		if( i <= periodo){
			if (i > 1) {
				System.out.println( i + " meses = " + capital * (taxa/100) * i);	
			}else{
				System.out.println( i + " mes = " + capital * (taxa/100) * i);	
			}
		}
		
		i++;
		
		if (i <= periodo) imprimirJuros(capital, taxa, periodo, i);
	}
}