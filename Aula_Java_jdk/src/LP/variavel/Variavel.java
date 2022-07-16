package LP.variavel;

public class Variavel
{
	public static void main(String[] args)
	{
		/** as variáveis são valores que podem sempre esta sendo modificadas
		a qualquer momento podendo na linha seguinte esta sendo mudada seu valor
		até mesmo fazer conversões para outro tipo. 
		*/

		/*
		 * A variável é criada para uso de uma forma inteligente
		 * para que possamos utiliza-la sempre sem precisar repetir
		 */
		String primeiroNome, segundoNome; // se a variável por do mesmo tipo podemos declarar todas na mesma linha.

		String nomes = "Leandro"; // aqui temos uma variável de String
		// String é tipo de textos
		System.out.println("Variavel 01 " + nomes + "\n");
		nomes = "Leticia"; // podemos mudar o valor sempre diferente de uma CONSTANTE.
		System.out.println("Variavel 02 mudada  " + nomes + "\n");

		// podemos ter varivávei com todos os tipos
		int idade = 38;

		System.out.println("Variavel int   " + idade + "\n");

		boolean casado = false;

		System.out.println("Variavel boolean  " + casado + "\n");
	}

}
