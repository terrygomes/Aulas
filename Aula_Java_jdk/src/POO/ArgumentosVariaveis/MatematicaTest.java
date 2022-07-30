package POO.ArgumentosVariaveis;

public class MatematicaTest
{

	public static void main(String[] args)
	{
		String imprimir;
		Matematica m = new Matematica();
		int resultado = m.maior(45, 200);
		imprimir = "O Maior entre 45, 200 e = " + resultado + "\n";
		System.out.println(imprimir);

		
		/*
		 * Neste método passamos a variável para qualquer quantidade de números
		 * lista de números, mesmo assim após ser executado se transforma em Array
		 * */
		double so = m.soma("Sistema sem Array",65, 55, 2222, 5555, 6666);
		imprimir = "O resultado sem Array " + so + "\n";
		System.out.println(imprimir);

		/*
		 * Systema com array que representa a mesma função de numeração acima 
		 * tendo suporte para passsar variedade de números ou objetos
		 * sendo indexados
		 * */
		double[] numeros =
		{
			65,
			55,
			2222,
			5555,
			6666
		};

		double so2 = m.soma2("Sistema com Array mesma coisa",numeros);
		imprimir = "O resultado com Array " + so2 + "\n";
		System.out.println(imprimir);

		
		
		double rest = m.soma("Soma entre todos ",m.maior(3, 5), m.maior(2, 4));
		imprimir = "O resultado ipar e par e " + rest + "\n";
		System.out.println(imprimir);

	}

}
