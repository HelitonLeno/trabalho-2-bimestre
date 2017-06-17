import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		String[] nomes = new String[10];

		pegarNomes(nomes, 0);

		imprimirNomes(nomes, 0);
	}

	private static void imprimirNomes(String[] nomes, int i) {
		System.out.println("Nome " + (i+1) + "º aluno = " + nomes[i]);
		i++;
		
		if(i < 10) imprimirNomes(nomes, i);
	}

	private static void pegarNomes(String[] nomes, int i) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite o nome do " + (i+1) + "º aluno: ");
		nomes[i] = in.nextLine();
		i++;

		if (i < 10) pegarNomes(nomes, i);
		in.close();
	}
}
