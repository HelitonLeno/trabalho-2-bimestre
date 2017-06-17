import java.util.Scanner;

public class Exercicio20{
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero: ");
        int numero = in.nextInt();

        int resultado = fatorial(numero);
        
        System.out.println("Resultado: " + resultado);        
   }

   private static int fatorial(int numero){
        if (numero < 2) return 1;

        else return numero * fatorial(numero - 1);
   }
}