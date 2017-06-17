import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite primeiro numero: ");
        int n1 = in.nextInt();

        System.out.println("Digite segundo numero: ");
        int n2 = in.nextInt();

        System.out.println("O MDC e: " + mdc(n1,n2));
    }

    private static int mdc(int n1, int n2){
        if(n1 < n2){
            System.out.println("Primeiro numero nao pode ser menor que o segundo.");
            System.exit(0);
        }

        int aux = n1 % n2;

        if(aux == 0){
            return n2;
        }else{
            return mdc(n2, aux);
        }
    }
}
