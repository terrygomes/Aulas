package LP.For;

public class For
{
	public static void main(String[] args)
	{
		// O fluxo for podemos usar um dentro do outro nas estrutura desejadas.
		int tamanho = 20;
		for (int x = 0; x < tamanho; x++)
		{
			for (int i = 0; i <= tamanho; i++)//
			{
				System.out.print("* ");
			}
			System.out.println();// Nessa linha dando o comando para pular para próxima linha 
		}

	}

}
