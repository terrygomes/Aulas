package POO.VariavelMEstaticos;

public class Galinha
{

	public int ovos; // total de ovos do objeto galinha
	public static int ovosDaGranja;// variável é global
	private String nome; // nome da galinha

	/*
	 * Neste método temos uma configuração onde para add o método botar tera que ser um em cada linha
	 * botar()
	 * botar()
	 * botar()
	 * botar()
	 */
	public void botar()
	{
		this.ovos++;// chamamos a variável ovos e add +1 para cada ovo que colocar
		Galinha.ovosDaGranja++; // contaremos o total de ovos de todas as galinhas
	}

	/*
	 * Neste método temos outra opção que para add o método botar2()
	 * botar2().botar2().botar2().botar2()
	 * nesse modo chamaremos o método atraves do . de acesso.
	 */
	public Galinha botar2()
	{
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}

	public void mostrar()
	{
		System.out.println(nome + "  colocou " + ovos + " ovos " + "\n");
	}

	public void setNome(String n)
	{
		this.nome = n;
	}

	public static double mediaDeOvos(int galinhas)
	{
		return Galinha.ovosDaGranja / galinhas;
	}

}
