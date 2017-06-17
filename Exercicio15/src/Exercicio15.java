import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		int idade = 0;
		
		double somaIdades = pegarIdades(idade, 0);
		
		System.out.println("A media de idade é: " + somaIdades /10);
	}
	
	public static int pegarIdades(int idade, int count){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a idade do " + (count+1) + "º aluno: ");
        idade += in.nextInt();
        count ++;
        
        if (count == 10) return idade;
        
        return pegarIdades(idade, count);
    }
}