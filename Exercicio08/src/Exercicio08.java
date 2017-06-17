public class Exercicio08 {

	public static void main(String[] args) {
		imprimirNumerosParesDecrescente();
	}

	static int counter = 100;
	private static void imprimirNumerosParesDecrescente() {
		System.out.println(counter);
		counter -= 2;
		
		if (counter >= 0) imprimirNumerosParesDecrescente();
	}
}