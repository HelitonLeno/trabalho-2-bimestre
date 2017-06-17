import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		int faltas = 0;
		
		double mediaFaltas = pegarFaltas(faltas, 0);
		
		System.out.println("A media de faltas é: " + mediaFaltas / 10);
	}
	
	public static int pegarFaltas(int faltas, int count){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite as faltas do " + (count+1) + "º aluno: ");
        faltas += in.nextInt();
        count ++;
        
        if (count == 10) return faltas;
        else return pegarFaltas(faltas, count);
        
    }
}