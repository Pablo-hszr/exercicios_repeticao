package exercicios_repeticao;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);	
		
		double x;
		int y;
		y = 0;
		
		while (y<10) 
		{
		y += 1; 	
		
		System.out.println ("Digite um número");
		x = leitor.nextDouble();
		
		if (x >=0)
		{
			
			System.out.println ("O número é positivo");
		}
		else
		    
		    System.out.println ("O número é negativo");
		
		
		
		

	}

	}
}

