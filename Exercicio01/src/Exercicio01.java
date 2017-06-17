
public class Exercicio01 {

    public static void main(String[] args) {
        imprimirNumerosCrescentes(0);
    }

    public static void imprimirNumerosCrescentes(int count) {
        System.out.println("Numero: " + count);
        count++;

        if (count <= 100) imprimirNumerosCrescentes(count);
    }
}