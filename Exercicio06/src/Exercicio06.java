
public class Exercicio06 {

	public static void main(String[] args) {
		imprimirNumerosPares();
	}

	static int counter = 0;
	private static void imprimirNumerosPares() {
		System.out.println(counter);
		counter += 2;
		
		if (counter <= 100) imprimirNumerosPares();
	}
}