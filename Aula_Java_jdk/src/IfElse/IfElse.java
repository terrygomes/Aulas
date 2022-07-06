package IfElse;

public class IfElse
{
	/**Fluxo condicional
	 * if / else
	 * */

	// index (inicializa)
	public static void main(String[] args)
	{

		/**
		 * Temos várias maneitras de fazer o fluxo condicional,
		 * 
		 * */
		String msg;// podemos apresentar a msg de vários tipos, chamando uma String criando uma variável ou podemos tambem criar um OBjeto se for o caso
		// para a instrução ficar bem dinâmica.
		int verdade = 50; // aqui é o valor que será avaliado no fluxo
		if (verdade < 100) // if = se. Se o valor 100 for menor que 50 executa a instrução
		{
			msg = "Isso e verdade ? = " + "Sim";// agregamos o valor da instrução, concatenando instruções para ficar clara o que está no fluxo.
		}
		else // else = Se não. Se não for executa essa instrução
		{
			msg = "Isso nao e = " + "Verdade !!";
		}
		System.out.println(msg + "\n");

		// nesse exemplo é o mesmo fluxo com resultado diferente.
		String msg2;
		int verdade2 = 50;
		if (verdade2 > 100) // se a variável for maior que 100 essa instrução será verdadeira
		{
			msg2 = "Isso e verdade ? = " + "Sim";
		}
		else
		{
			msg2 = "Isso nao e = " + "Verdade !!";
		}
		System.out.println(msg2 + "\n");

		// podemos ter um if dentro de outro if.
		/*
		 * podemos fazer um fluxo dentro de outro fluxo. if alinhado
		 * podemos fazer comparações.
		 * podemos compara até valores de Strings.
		 */

		String msgs;
		int idade = 16;
		if (idade <= 11)
		{
			msgs = "Temos uma = " + "Crianca";
		}
		else if (idade <= 11 && idade <= 18) // temos outro tipo de comparação no caso idade menor = a 11 e idade menor = a 18 será executada essa instrução
		// no caso as 2 condições tem que ser verdadeiras.
		{
			msgs = "Temos uma = " + "Adolescente";
		}
		else if (idade > 18 && idade <= 60)
		{
			msgs = "Temos uma = " + "Adulto";
		}
		else
		{
			msgs = "Temos uma = " + "Melhor Idade";

		}
		System.out.println(msgs + "\n");

		String notas = null;
		int nota = 8;
		if (nota >= 9)
		{
			notas = "  Aprovado!!";
		}
		else
		{
			System.out.println("Reprovado");
			if (nota >= 8)// podemos fazer uma avaliação dentro de outro fluxo
			{
				notas = "Porem pode fazer Recuperacao";
			}

		}
		System.out.println(notas + "\n");

	}

}
