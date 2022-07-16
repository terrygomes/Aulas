package LP.Arrays;

import java.util.ArrayList;

public class ArrayLists
{

	public static void main(String[] args)
	{

		// ArrayList é um Collection Framework para manipulação de listas (elementos)
		// nele podemos adicionar/remover/pesquisar/recuperar.

		ArrayList<String> cores = new ArrayList<>();// na sua estrutura podemos passar qual será o tipo de dados ArrayList<String> no caso String será o tipo de dados
		// que será manipulado.

		cores.add("Branco");// no método add podemos adcionar vários elementos
		cores.add("Azul");
		cores.add("Rosa");
		cores.add(0, "Preto");// nesse método podemos definir qual cor será a primeira, aqui definimos o índice 0 como o primeiro no caso
		// se não fosse definido manualmente sua ordem seria no modo da criação.
		cores.add("Amarelo");
		cores.add("Vermelho");
		cores.add("Marron");

		System.out.println("Temo as as cores = " + cores + "\n");// Será impresso as cores dentro do nosso Arraylist
		System.out.println("Temo as as cores = " + cores.toString() + "\n");// Será impresso as cores dentro do nosso Arraylist

		System.out.println("Quantidade (Tamanho) do ArrayList = " + cores.size() + "\n");// Será impresso quantas cores temos dentro do nosso Arraylist (Tamanho)

		System.out.println("Qual cor  = " + cores.get(2) + "\n");// O método get(2) recupera p elementos em sua posição, get()recupera 2 será a posição recuperada

		System.out.println("Qual indice  de Vermelho = " + cores.indexOf("Vermelho") + "\n");// nesse método o índice da posição do elemento.

		System.out.println("Vamos remover o Marron = " + cores.remove("Marron") + "\n");// Nesse método o elemento marron será removido da lista

		// O método contains retorna um boolean (True/False)
		System.out.println("Dentro da nossa lista temos Amarelo = " + cores.contains("Amarelo") + "\n");// O método contains verifica se o elemento indicado tem dentro da lista

		System.out.println("Dentro da nossa lista temos Cinza = " + cores.contains("Cinza") + "\n");// O método contains verifica se o elemento indicado tem dentro da lista,
		// neste caso não temos este elemento dentro da lista

	}
}
