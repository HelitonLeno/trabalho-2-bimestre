import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double[][] matriz = new double[5][5];

        pegarValores(matriz, 0, 0, 0);

        imprimirNumeros(matriz, 0, 0, 0);
    }

    public static double[][] pegarValores(double[][] matriz, int i, int j, int contador){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o " + (contador+1) + "º numero: ");
        matriz[i][j] = in.nextDouble();
        j++;
        contador++;

        if (j == 5){
            i++;
            j = 0;
        }

        if (i > 4) return matriz;

        return pegarValores(matriz, i, j, contador);
    }

    public static void imprimirNumeros(double[][] matriz, int i, int j, int contador){
        System.out.println("Numero " + (contador+1) + "º = " + matriz[i][j]);
        j++;
        contador++;

        if (j == 5){
            i++;
            j = 0;
        }

        if (i < 5) imprimirNumeros(matriz, i, j, contador);
    }
}
