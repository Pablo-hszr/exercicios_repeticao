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
		
		System.out.println ("Digite um n�mero");
		x = leitor.nextDouble();
		
		if (x >=0)
		{
			
			System.out.println ("O n�mero � positivo");
		}
		else
		    
		    System.out.println ("O n�mero � negativo");
		
		
		
		

	}

	}
}

