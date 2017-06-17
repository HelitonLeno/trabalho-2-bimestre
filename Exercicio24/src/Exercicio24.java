import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos discos?: ");
        int discos = entrada.nextInt();

        gerarJogadas(discos, "Origem", "Destino", "Trabalho");
    }

    private static void gerarJogadas(int discos, String origem, String trabalho, String destino) {
        if( discos > 0 ) {
            gerarJogadas(discos - 1, origem, destino, trabalho);
            
            System.out.printf("%s PARA %s\n", origem, trabalho);
            
            gerarJogadas(discos - 1, destino, trabalho, origem);
        }
    }
}