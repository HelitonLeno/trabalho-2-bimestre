public class Exercicio07 {
	public static void main(String[] args) {
		imprimirNumerosImpares();
	}

	static int counter = 1;
	private static void imprimirNumerosImpares() {
		System.out.println(counter);
		counter += 2;
		
		if (counter <= 100) imprimirNumerosImpares();
	}
}