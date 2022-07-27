package POO.Modificadores;

public class funcionatioTest
{
	public static void main(String[] args)
	{
		/**
		 * Modificador de acesso [privado]
		 * 
		 */

		Funcionatio f = new Funcionatio();// cliamos o objeto funcionário
		f.setPrivado(55);// aqui recamos o valor mesmo privado /
		f.setNome("Leandro");
		f.mostarPrivado(); // imprime na tela o valor troca/ valor que antes era 125

		Funcionatio f2 = new Funcionatio();
		f2.getPrivado(); // Aqui podemos acessador o valor original
		f2.setNome("Leandro"); // trocar o nome
		f2.mostarPrivado(); // imprime na tela o valor

		/**
		 * Modificador de acesso [publico] 
		 * */

		Funcionatio pu = new Funcionatio(); // cliamos o objeto funcionário
		pu.segundoNome = "Leandro"; // trocamos e usamos livremente o valores públicos
		pu.segundoPrivado = 82;
		pu.mostarPublico(); // imprime na tela

		/**
		 * Modificador de acesso [package] 
		 * 
		 * só pode acessar dentro do mesma pasta (package), se for massar esse método em outra classe fora da pasta(package), não tera acesso
		 * */

		Funcionatio pa = new Funcionatio(); // cliamos o objeto funcionário
		pa.segundoNome = "Leandro"; // trocamos e usamos livremente o valores públicos
		pa.segundoPrivado = 82;
		pa.mostarPublico(); // imprime na tela

	}

}
