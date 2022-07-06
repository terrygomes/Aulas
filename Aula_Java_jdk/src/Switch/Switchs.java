package Switch;

public class Switchs
{

	public static void main(String[] args)
	{

		/*
		 * Temos do switch que é muito mais rápido que o if e else
		 * porém não tem a mesma mobilidade em comparações
		 * nesse caso o switch e muito mais rápido no fluxo por ser direto e ter ponto de
		 * parada BREAK em seu método.
		 */
		String msg;
		char sexo = 'M';
		switch (sexo)
		{
		case 'M':
			msg = "O sexo e Macho";
			break;
		case 'F':
			msg = "O sexo e Femea";
			break;
		default:
			msg = "Sem sexo";
		}
		System.out.println(msg + "\n");

		// no caso o switch pode fazer vários tipos de comparação e tornar ate o código
		// mais enchuto.
		// é muito usado por ser muito rápido no seu processo de execução.
		// temos vários modos de aprimirar e tormar-lo mais rápidos ainda com rótudo
		// quando se tem um fluxo dentro de outro fluxo.
		String msgs;
		String buscar = "Familia";
		switch (buscar)
		{
		case "Familia":
		case "Esposa":
		case "Filhos":
			msgs = "Faz parte da familia";
			break;
		case "Tia":
		case "Vo":
			msgs = "Parentes";
			break;
		default:
			msgs = "Sem sexo";
		}
		System.out.println(msgs);
	}

}
