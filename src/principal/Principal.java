package principal;

import java.util.Scanner;

import auxiliares.Tomar;

public class Principal {
	
	public static void main(String[] args) {
		
		int cerveja = 0;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a quantidade de cervejas no freezer:");
		cerveja = leitor.nextInt();
		for(int i = cerveja; i>0;i--) {
			Tomar toma = new Tomar(i);
			toma.beber();
		}
	}
}
