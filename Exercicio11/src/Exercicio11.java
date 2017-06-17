import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
        double[][][] matriz = new double[5][5][5];

        pegarValores(matriz, 0, 0, 0, 0);

        imprimirNumeros(matriz, 0, 0, 0, 0);
    }

    public static double[][][] pegarValores(double[][][] matriz, int i, int j, int k, int contador){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o " + (contador+1) + "º numero: ");
        matriz[i][j][k] = in.nextDouble();
        k++;
        contador++;

        if (k == 5){
            j++;
            k = 0;
        }
        
        if (j == 5) {
			i++;
			j = 0;
		}

        if (i > 4) return matriz;

        return pegarValores(matriz, i, j, k, contador);
    }

    public static void imprimirNumeros(double[][][] matriz, int i, int j, int k, int contador){
        System.out.println("Numero " + (contador+1) + "º = " + matriz[i][j][k]);
        k++;
        contador++;

        if (k == 5){
            j++;
            k = 0;
        }
        
        if (j == 5) {
			i++;
			j = 0;
		}

        if (i < 5) imprimirNumeros(matriz, i, j, k, contador);
    }
}
