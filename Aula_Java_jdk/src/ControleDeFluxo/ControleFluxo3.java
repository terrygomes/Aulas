package ControleDeFluxo;

public class ControleFluxo3
{
	public static void main(String[] args)
	{

		/**Neste método veremos a palavra CONITUE,
		 * ela não encerra o loop porém o valor que esta sendo comparado não será executado.
		 * */
		for (int i = 0; i < 10; i++)
		{
			if (i == 5) // Nesta comparação o valor 5 não será executado 
			{
				continue;// nessa palavra chave o valor 5 não será executado
			}
			System.out.println(i);
			// O fluxo será impresso de 0 a 4 ira pular o 5 e voltar a executar de 6 a 9.
		}
	}

}
