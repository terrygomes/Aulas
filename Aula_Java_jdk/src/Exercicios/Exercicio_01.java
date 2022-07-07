package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_01
{
	public static void main(String[] args)
	{
		String msg;// aqui passmos uma String para não precisar digitar sempre a saída
		Scanner s = new Scanner(System.in);// nesse método scaneamos o valor que a pessoa digitar
		System.out.println("Qual seu Palpite?"); // para fazer uma pergunta
		int palpite = s.nextInt();// recuperamos a String para inteiro

		Random r = new Random();
		int dado = r.nextInt(6) + 1;// Nessa linha recuperamos o valor em inteiro com 6 possibilidade (lados do dado)
		// 0-5 lembrando que começa com 0 e vai atá 5 para não cair no 0 colocamos +1 assim se cair 0 passa a ser 1 e se cair 5 passa a ser 6

		if (palpite == dado)// aqui se o palpite for igual ao dado número aleatório
		{
			msg = "Aceitou !!";

		}
		else
		{
			msg = "Errou !! ";
		}

		System.out.println(msg);

	}

}
