package POO.Cachorro;

public class CachorroTeste
{

	public static void main(String[] args)
	{
		/*
		 * Nessa classe criamos 2 objetos sobre 2 cachorros diferentes
		 * podemos chamar e atriburir as variáveis da classe Cachorro
		 */

		Cachorro pitbull = new Cachorro(); // criação de um novo Objeto
		pitbull.raça = "PitBull"; // Atributo valor tipo String Texto
		pitbull.tamanho = 40; // Atrinuto valor tipo primitivo inteiro
		pitbull.latir(); // Atrinuto que retorna a ação do método.

		System.out.println(pitbull.raça.toString()); // aqui podemos imprimir qualquer valor e passar para texto.

		Cachorro viralata = new Cachorro();
		viralata.raça = "ViraLata";
		viralata.tamanho = 40;
		viralata.latir();

		System.out.println(viralata.raça.toString());
	}

}
