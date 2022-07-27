package POO.Modificadores;

public class Funcionatio
{

	/*
	 * Modificadores de de acesso
	 */

	private int privado = 125;
	private String nome;

	public int segundoPrivado = 125;
	public String segundoNome;

	int terceiroPrivado = 125;
	String terceiroegundoNome;

	/*
	 * private : Somente acesso na própria classe
	 * private : Pode ser acessado somente dentro da sua própria classe, podemos acessar e modificar atraves do (get = recupera o valor / set = modifica o valor)
	 */

	/*
	 * package <nenhum> : Somente no mesmo pacote.
	 * package : Pode ser acessado por qualquer classe dentro de seu pacote (somente acessado dentro da pasta = Package), assim outra classe oou método que está foda da pasta não poderá
	 * acessar
	 */

	/*
	 * protected : Somente em subclasse.
	 * protected : Pode ser acessador dentro da classe e filhos da classe. será usado mais com Herança.
	 */

	/*
	 * public : esse modificador torna qualquer classe ou método publico e qualquer classe de qualquer lugar pode acessar qualquer método de qualquer lugar.
	 */

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public void mostarPrivado()
	{
		System.out.println("Resultador e " + privado + "  Nome e " + nome + "\n");
	}

	public void mostarPublico()
	{
		System.out.println("Resultador e " + segundoPrivado + "  Nome e " + segundoNome + "\n");
	}

	public void mostarPackage()
	{
		System.out.println("Resultador e " + terceiroPrivado + "  Nome e " + terceiroegundoNome + "\n");
	}

	public int getPrivado()
	{
		return privado;
	}

	public void setPrivado(int privado)
	{
		this.privado = privado;
	}

}
