package POO.Contas;

public class Conta
{
	private String cliente;// criei uma String de texto para o nome no cliente como privado para começar a trabalhar com get e set
	private double saldo;

	void exibirSaldo()
	{
		System.out.println(cliente + " seu saldo e = " + saldo + "\n");// aqui iremos imprimir na tela o nome do cliente e valor do sald
	}

	// Para fazer esse métodos teremos que fazer as seguintes perguntas
	/*
	 * ver se tem autorização
	 * se tem limites do dia não foi ultrapassado
	 * se tem saldo na conta
	 * deduzir do saldo o valor do saque
	 * atualizar registros do banco
	 * entregar o dinheiro ao cliente
	 */

	// faremos a operação bem simplificada
	void sacar(double valor)
	{
		this.saldo -= valor;// ao sacar o valor o valor so saque será deduzido
	}

	// faremos a operação bem simplificada
	void deposito(double valor)
	{
		this.saldo += valor; // ao depositar o valor será somado.
	}

	// Aqrui também faremos os seguintes
	// bem simplificado que acima

	/*
	 * ver se tem autorização
	 * se tem limites do dia não foi ultrapassado
	 * se tem saldo na conta
	 * deduzir do saldo o valor do saque
	 * atualizar registros do banco
	 * entregar o dinheiro ao cliente
	 */

	void tranferePara(Conta destino, double valor)// método para transferir
	{
		this.sacar(valor);
		destino.deposito(valor);
	}

	public String getCliente()
	{
		return cliente;
	}

	public void setCliente(String cliente)
	{
		this.cliente = cliente;
	}

	public double getSaldo()
	{
		return saldo;
	}

	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}

}
