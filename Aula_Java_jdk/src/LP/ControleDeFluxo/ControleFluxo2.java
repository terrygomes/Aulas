package LP.ControleDeFluxo;

public class ControleFluxo2
{
	public static void main(String[] args)
	{

		/**Nesse método veremos a palavra chave BREAK,
		 * ela encerra o fluxo em que for adicionada porem 
		 * se tiver outro fluxo dentro o fluxo interno será executado.
		 * 
		 * */
		// Neste método temos um for percorrendo em 10 posições de 0a9
		for (int i = 0; i < 10; i++)
		{
			if (i == 5)// fazendo a comparação se i for == a 5 para por aqui e encerra o loop
			{
				break;// Nossa palavra chave para que p loop pare na posição comparada.
			}

			System.out.println(i);
		}
	}
}
