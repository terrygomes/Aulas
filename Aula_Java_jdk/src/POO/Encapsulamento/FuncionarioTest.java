package POO.Encapsulamento;

public class FuncionarioTest
{
	public static void main(String[] args)
	{
		
		/*
		 * Nesse modo podemos imprimir na tela se esta ativo e trocar o valor da variável
		 * 
		 * */
		Funcionario fun = new Funcionario();
		fun.setNome("Leandro");
		fun.isAtivo();
		fun.mostar();

		/*
		 * Nesse modo podemos imprimir na tela se esta ativo e recuperar o valor da variável
		 * 
		 * */
		Funcionario fun2 = new Funcionario();
		fun2.getNome();
		fun2.isAtivo();
		fun2.mostar();
	}

}
