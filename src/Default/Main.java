package Default;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while(true) {
			int n1,n2;
		
			Scanner scanner = new Scanner(System.in);
			System.out.print("Digite a primeira nota : ");
			n1 = scanner.nextInt();
			System.out.print("Digite a segunda nota: ");
			n2 = scanner.nextInt();
		
			double media = (n1+n2)/2;
		
		
			if(media >= 6) {
				System.out.println("O valor da sua media é: "+ media + " " + " Parabens!! "); 
			}else if (media < 6){
				System.out.println("O Valor da sua media é: "+ media + " " + "Você reprovou estude mais!!!");
			}
			System.out.print("Deseja calcular a média novamente? (s/n):");
			String escolha = scanner.next();
			if(escolha.equals("n")  ) {
				break;
			}
		
		
		}
		
	}

}
