package exercicios_repeticao;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);	
		
		int x, y, soma;
		y = 0;
		x = 0;
		soma = 0;
		
		while (y<20)
		{
			y += 1; 	
			System.out.print("Escreva um n�mero");
	        x = leitor.nextInt();
			
	        soma += x;
		}

        System.out.println("A m�dia �: " + (soma/20) );
        System.out.println("A soma �: " + (soma) );
	}

}
