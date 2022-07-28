package POO.Encapsulamento;

public class Funcionario
{
	/**
	 * Encapsulamento
	 * */

	/*
	 * Neste caso esses valores só podem sem acessado dentro da classe
	 * sendo recuperado e modificados com get e set
	 * get = recupera o valor
	 * set = configura (pode modificar o valor)
	 * is = se é ativo
	 */

	private String nome = "Adriana"; // valor em String privado
	private boolean ativo;// valor booleam se esta ativo ou não

	public String getNome()
	{
		return nome;
	}

	public void setNome(String n)
	{
		this.nome = n;
	}

	public boolean isAtivo() // se esta ativo
	{
		return ativo;
	}

	public void setAtivo(boolean ativo) // pode passar o valor para ser modificado
	{
		this.ativo = ativo;
	}

	public void mostar()
	{
		System.out.println("Qual e o nome " + nome + " Esta ativo ou inativo? " + ativo + "\n");
	}
}
