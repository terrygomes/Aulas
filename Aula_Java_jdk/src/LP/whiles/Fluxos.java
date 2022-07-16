package LP.whiles;

import java.util.ArrayList;
import java.util.Scanner;

public class Fluxos
{
	public static void main(String[] args)
	{
		int i = 0; // se o fluxo não for verdeadeira nem entra.
		while (i < 2) // o while é um fluxo de repetição semelhante com o for()
		// se a condição for veidadeira o fluxo segue
		{
			System.out.println("Valor de While = " + i + "\n");
			i++; // no caso se não incrementar o fluxo se repetirar infinitamente.
		}

		int j = 2; // sendo verdadeira ou não a condição entra 1 vez
		do // no caso o fluxo começa passa 1 vez e para sendo falso.
		{
			System.out.println("Valor de Do While = " + j);
			j++;
		}

		while (j < 5); // aqui a condição é sempre avaliada depois do bloco.
		// essa avaliação sempre será avaliada pelo menos 1 vez sendo verdadeira ou não.

		/* FLUXO DE REPETIÇÃO COM ENTRADA */
		ArrayList<String> produtos = new ArrayList<>(); // ArrayList é um Framework para listar
		Scanner s = new Scanner(System.in); // Nessa linha de comando recupera o valor digitado
		System.out.println("Liste seus produtos e para sair digite FIM");// orientação de como funciona

		String produto;
		while (!"FIM".equals(produto = s.nextLine())) // para pegar a palavra que ira fechar o programa 
		{
			produtos.add(produto);// enquanto a palavra não for digitada a lista continua.
		}
		System.out.println(produtos.toString());// aqui apresentamso o resultado lendo como string.

	}

}
