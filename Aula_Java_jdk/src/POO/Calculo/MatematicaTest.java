package POO.Calculo;

public class MatematicaTest
{
	public static void main(String[] args)
	{
		Matematica m = new Matematica();
		int resultado = m.maior(10, 35);
		System.out.println("O Maior entre 10/35 e = " + resultado + "\n");

		double so = m.soma(15, 45);
		System.out.println("O resultado e " + so + "\n");

		double rest = m.soma(m.maior(3, 5), m.maior(2, 4));
		System.out.println("O resultado ipar e par e " + rest + "\n");

	}

}
