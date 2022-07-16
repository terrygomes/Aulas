package LP.For;

import java.util.ArrayList;

public class Foreach
{
	public static void main(String[] args)
	{
		// no foreach só podemos percorrer para frente
		// já no for tradicional podemos percorrer para frente e para tras, temos mais controle
		int[] par =
		{
			2,
			4,
			6,
			8
		};
		for (int pares : par)
		{
			System.out.print(pares);
		}

		// Nesse método podemos usar o for e foreach para percorer uma lista
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
		{
			list.add(i);// add uma lista
		}

		for (Integer lista : list) // percorremos uma lista
		{
			System.out.println(lista);
		}

	}
}
