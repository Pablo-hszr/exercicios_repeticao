package exercicios_repeticao;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);	
		
		int x, N; 
		x = 1;
		
		System.out.println ("Digite um número");
		N = leitor.nextInt();
		
	
		
		 while (x <= N)
		{
			System.out.println(x);
			x += 1;
		}
		

			
		
	}

}
