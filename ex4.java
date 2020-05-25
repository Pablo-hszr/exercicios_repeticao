package exercicios_repeticao;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);	
		
		int x, y, z;
		x = 0;
		y = 0;
		z = 0;
		
		while (y<15) 
		{
		y += 1; 	
		
		System.out.println ("Digite um número");
		x = leitor.nextInt();
	 
		if (x > z)
		
			z = x;
		}		
		System.out.println ("O maior número é: " +z);
		

	}

	}

