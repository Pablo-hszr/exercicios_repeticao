package exercicios_repeticao;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);	
		
		int x, salariof;
		double altura, salario, soma, alturamai, alturamen, media;
		String sexo;
		soma = 0;
		alturamai = 0;
		alturamen = 999;
		salariof = 0;
		x = 0;
		
		while (x<3) 
		{
		x += 1;

		System.out.println ("Escreva a altura do(a) funcionario(a)");
		altura = leitor.nextDouble();
		System.out.println ("Escreva o sexo do(a) funcionario(a) com F ou M");
		sexo = leitor.next();
		System.out.println ("Escreva o sal�rio do(a) funcionario(a)");
		salario = leitor.nextDouble();
		
		if(altura > alturamai)
		{
			alturamai = altura;
		}
		if(altura < alturamen)
		{
			alturamen = altura;
		}
		if (sexo.equals("F"))
		{
		if(salario <= 1000)
		{
		salariof++;
		}
		}
		soma += salario;
}
		media = soma/20;
		System.out.println ("A m�dia do salario dos funcionarios � R$" +(media));
		System.out.println ("A menor altura � " +(alturamen));
		System.out.println ("A maior altura � " +(alturamai));
		System.out.println ("A quantidade de mulheres com sal�rio de at� 1000 reais � " +(salariof));
		
		
	}
	}		
