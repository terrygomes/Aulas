package POO.Contas;

public class ContaTest
{
	public static void main(String[] args)
	{
		Conta conta = new Conta(); // criada uma conta 
		conta.setCliente("Leandro"); // nome no modo set
		conta.setSaldo(10_000.00);// valor no modo set
		conta.exibirSaldo(); // exibir saldo

		conta.sacar(1000); // ao sacar o valor será reduzido 
		conta.exibirSaldo();

		conta.deposito(9_000.00); // ao depositar o valor será somado
		conta.exibirSaldo();

		Conta destino = new Conta();// conta que ira destinar-se ao depósito 
		destino.setCliente("Daniele");
		destino.setSaldo(9000);
		destino.exibirSaldo();

		conta.tranferePara(destino, 1000.00); // médodo de tranferência
		conta.exibirSaldo();
		destino.exibirSaldo();

	}

}
