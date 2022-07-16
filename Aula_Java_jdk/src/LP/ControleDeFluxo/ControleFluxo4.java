package LP.ControleDeFluxo;

public class ControleFluxo4
{
	public static void main(String[] args)
	{

		/**
		 * Neste método iremos ver como funciona os RÓTULOS
		 * 
		 * Ao codificar os rótuslo nos seus fluxos ele ira parar por completo
		 * se tiver outro fluxo interno não será executado.
		 * */

		boolean[][] matrix =
		{
			{
				false,
				true,// Nossa palavra alvo 
				false,
				false,
				false
			},
			{
				false,
				false,
				false,
				false,
				false
			}
		};
			/*Nesse 2 fluxos  um dentro do outro teremos a palavra
			 * chave break para parar o fluxo interno, porém se não adicionarmos 
			 * o rórulo o fluxo continuaria executando.
			 * */
		
		rotulo: // nosso rótulode parada, após achar a palavra alvo encerrar todos os fluxos.
		for (int a = 0; a < matrix.length; a++)
		{
			System.out.println("A ");

			for (int b = 0; b < matrix[a].length; b++)
			{
				if (matrix[a][b])// nosssa condição para percorrer na primeira dimenção. 
				{
					System.out.println("TRUE "); // palavra ou valor alvo dentro do array
					break rotulo; // quando for encontrada a palavra ou valor alvo do array o fluxo encerra total.
				}
				System.out.println("B ");
			}
		}
	}

}
