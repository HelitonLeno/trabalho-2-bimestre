public class Exercicio02 {

    public static void main(String[] args) {
        imprimirNumerosDecrescentes(100);
    }

    private static void imprimirNumerosDecrescentes(int count) {
        System.out.println("Numero: " + count);
        count--;

        if (count >= 0) imprimirNumerosDecrescentes(count);
    }
}