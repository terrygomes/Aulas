package POO.VariavelMEstaticos;

public class GalinhaTest
{
	public static void main(String[] args)
	{
		Galinha g1 = new Galinha();
		g1.botar();
		g1.botar();
		g1.botar();
		g1.botar();
		g1.botar();
		g1.botar();
		g1.setNome("Galinha 01");
		g1.mostrar();

		Galinha g2 = new Galinha();
		g2.botar2().botar2().botar2().botar2();
		g2.setNome("Galinha 02");
		g2.mostrar();

		Galinha g3 = new Galinha();
		g3.botar2().botar2().botar2().botar2().botar2();
		g3.setNome("Galinha 03");
		g3.mostrar();

		System.out.println("Total de todas as galinhas " + Galinha.ovosDaGranja);
		System.out.println("Total de todas as galinhas " + Galinha.mediaDeOvos(3));
	}

}
