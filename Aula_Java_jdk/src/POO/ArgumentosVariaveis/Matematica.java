package POO.ArgumentosVariaveis;

public class Matematica
{
	public int maior(int um, int dois)
	{
		if (um > dois)
		{
			return um;
		}
		else
		{
			return dois;
		}
	}

	/*
	 * Neste método podemos parssar uma variedade de números para calculos e etc
	 * Este argumento variável só pode ser terminando nunca poderá ter mais de 2 argumento dentro de um método.
	 * porém podemos passar vários argumentos dentro do método e terminando com um argumento variável.
	 */

	public double soma(String titulos, double... numeros)
	{
		System.out.println(titulos);
		double total = 0;
		for (double n : numeros)
		{
			total += n;
		}
		return total;
	}

	/*
	 * Neste método de array mostra o mesmo resultado da lista acima,
	 * apesar de que o método acima após ser executado se tranforma em array
	 */

	public double soma2(String titulo, double[] numeros)
	{
		System.out.println(titulo);
		double total = 0;
		for (double n : numeros)
		{
			total += n;
		}
		return total;
	}

}
