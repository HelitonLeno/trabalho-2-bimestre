public class Exercicio09 {

	public static void main(String[] args) {
		numerosImparesDecrescente();
	}

	static int counter = 99;
	private static void numerosImparesDecrescente() {
		System.out.println(counter);
		counter -= 2;
		
		if (counter >= 0) numerosImparesDecrescente();
	}
}