import java.util.Scanner;

public class Exercicio13 {
	
	public static void main(String[] args) {
		double nota = 0;
		
		double media = pegarNotas(nota, 0);
		
		System.out.println("A media e: " + media/10);
	}
	
	public static double pegarNotas(double nota, int count){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a " + (count+1) + "º nota: ");
        nota += in.nextDouble();
        count ++;
        
        if (count == 10) return nota;
        else return pegarNotas(nota, count);
        
    }
}
