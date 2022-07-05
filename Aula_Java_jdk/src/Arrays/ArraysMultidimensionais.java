package Arrays;

public class ArraysMultidimensionais
{

	public static void main(String[] args)
	{

		/**Clássico Arrays de uma dimensão
		 * */
		String[] um =
		{
			"Leandro",
			"TerryMaster",
			"TerryGomes",
			"Leo"
		};
		System.out.println("Ver quantos Arrays Tem = " + um.length + "\n"); // Ira Imprimir quantas posições tem o Array

		/**Agora teremos Arrays de 2 dimensões seguido de 2 colchetes [][].
		 * nossa estrutura do Array muito parecisa com a linguagem Json Estrutura de Arrays
		 * Nosso método é formado po Tipo (String) seguido de [][] = 2 Colchetes e separado por chaves{} 
		 * cuidado para não confundir com as {} chaves que separa o método.
		 * */

		String[][] dois =
		{ // chaves que separa o método da instrução

			{ // chaves que separa as instruções

				// elemento do Arrays
				"Leandro",
				"TerryMaster",
				"TerryGomes",
				"Leo" // o último elemento não precisa usar a "VÍRGULA" ,
			},
			// os Arrays muiltdimensões são separados por "VÍRGULA" ,
			{
				// valores do Arrays
				"Daniele",
				"Leticia",
				"Marli",
				"Leandra",
				"Lavinia"
			}
			// O último não precisa, assim como o último valor

		};// chaves que separa o método da instrução, final .

		System.out.println("Mostra quantos Arrays tem  = " + dois[0].length + "\n");// Ira mostrar quantos elemtnos tem dentro do primeiro Array

		System.out.println("Mostra quantos Arrays tem segundo = " + dois[1].length + "\n");// Ira mostrar quantos elemtnos tem dentro do segundo Array

		System.out.println("Mostra quanto Array tem  = " + dois.length + "\n"); // O método length mostra quandos Arrays ou elemento tem dentro.

		// para acessar o primeiro elemento de cada Array
		System.out.println("Primeiro Valor de Cada Array = " + dois[0][0] + "\n"); // Aqui será impresso o elemento do primeiro Array na posição 0, [0] = Primeiro Array,
		// o segundo [0] = "Leandro" elemento do primeiro Array.

		System.out.println("Segundo Valor de Cada Array = " + dois[1][0] + "\n"); // Aqui será impresso o primeiro elemento do segundo Array [1] = segundo Array
		// [0] = "Daniele" primeiro elemento do segundo Array

		dois[1][0] = "DANIELE";// Nessa variável mudaremos o elemento do segundo Array
		System.out.println("Mudanca do segundo Array = " + dois[1][0] + "\n"); // no caso "Daniele" passa a ser "DANIELE"
	}

}
