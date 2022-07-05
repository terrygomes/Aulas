package Arrays;

import java.util.Arrays;

public class ArraysSimples
{
	/**
	 * Método Main(Index/ Inicializa)
	 * Arrays Simples com uma dimenção
	 * */
	public static void main(String[] args)
	{

		// toda lista de array começa na posição 0
		// a não ser que sejam indexados manualmente na programação
		// Método Arrays de String (Primitivo ), pode ser feita converção para qualquer tipo primitivo

		// colchetes [] indexar/Chave {} para os valores.
		// Exp:[0] / {"Brasil"}
		// Método de Array de String simples com uma dimenção
		/**
		 * Quando falamos método simples é por quê a chave [] simples apenas 1, [][]esse será de 2 dimenção por conter 2 chaves.
		 * */
		String[] paises =
		{
			// todo array começa na posição 0
			"Brasil", // posição 0
			"Espanha", // posição 1
			"Russia", // posição 2
			"India", // posição 3
			"china"// posição 4
		};
		System.out.println("Calor da posicao Array = " + paises[0] + "\n"); // Ao imprimir na tela nesse linha vamos trazer o valor do primeiro arrays (Brasil).

		Arrays.sort(paises, 0, paises.length);// O método sort pode ordenar na posição Array = paises 0 = a posição e paises.length = percorrera até a ultima posição oodenando
		System.out.println("Valor ordenado = " + Arrays.toString(paises) + "\n"); // A classe Arrays converte para String e mostra os valores de todo array

		int posicao = Arrays.binarySearch(paises, "Brasil");// binarysearch irá buscar a posição elemento e dentro do Array indicado (paises = Array e "Brasil" = Elemento.
		System.out.println("Valor da busca da posicao Elemento = " + posicao + "\n"); // Irá imprimir o valor da posição e mostrar a posição Elemento (Brasil).

		// muito cuidado na posição e linha que irá escrever, após essa variável o valor mudará
		paises[0] = "BRASIL"; // Pelo array podemos modar o valor (alterar) a posição e colcoar outro valor
		System.out.println("Troca do valor do Array = " + paises[0] + "\n"); // Ao imprimir na tela o valor indexado. A veriável é trocada pelo novo valor e é impresso

		System.out.println("Numeros de posicoes dentro do Array = " + paises.length + "\n"); // Com a propriedade (length) podemos descobrir quantas posições temos dentro do Array.

		System.out.println("Converte em String e mostra os valores = " + Arrays.toString(paises) + "\n"); // A classe Arrays converte para String e mostra os valores de todo array

		int[] impares = new int[5]; // Ao criar um array com primitivos ou objetos terá que colocar a intenção de posição, quantas posições terá seu Array

		// Qauntidades de posições de Arrays 5 começando por 0
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;

		System.out.println("Calor da posicao Array = " + paises[4] + "\n"); // Ao imprimir na tela o valor indexado.
		impares[1] = 7;
		System.out.println("Troca do valor do Array = " + paises[1] + "\n"); // // Ao imprimir na tela o valor indexado. A veriável é trocada pelo novo valor e é impresso

		System.out.println("Numeros de posicoes dentro do Array = " + impares.length + "\n"); // Com a propriedade (length) podemos descobrir quantas posições temos dentro do Array.

		System.out.println("Converte em String e mostra os valores = " + Arrays.toString(impares) + "\n"); // A classe Arrays converte para String e mostra os valores de todo array

		// podemos acessar qualquer valor nas posição do Array
		Double[] valor =
		{
			11.0,
			55.10,
			50.99,
			99.1
		};
		System.out.println("Acesso ao valor da posicao 3 = " + valor[3].doubleValue()); // Nesta linha irá imprimir o valor da posição [3] = 99.1

	}

}
