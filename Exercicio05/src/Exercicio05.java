import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Integer[] vetor = new Integer[10];

        pegarValores(vetor, 0);
        
        int valor = vetor[9];

        Integer maiorValor = pegarMaiorValor(vetor, 0, valor);

        System.out.println("O maior valor digitado foi: " + maiorValor);
    }
    
    static Integer pegarMaiorValor(Integer[] vetor, int i, int valor) {
    	if (vetor[i] > valor) valor = vetor[i];
    	i++;
    	
    	if(i < 10) return pegarMaiorValor(vetor, i, valor);
		
		return valor;
	}

    static void pegarValores(Integer[] vetor, int counter){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o " + (counter + 1) + "° numero: ");
        vetor[counter] = in.nextInt();
        counter++;
        
        if (counter < 10) pegarValores(vetor, counter);
    }
}