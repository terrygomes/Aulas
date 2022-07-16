package AutoBoxing;

public class AutoBoxings
{
	public static void main(String[] args)
	{
		// Encapsulameno
		Integer x = new Integer(555); // tipo Wrappers integer empacotado
		int a = x.intValue(); // desempacotando tipo primitivo
		a++; // incrementar
		x = new Integer(a); // re- empacotar

		System.out.println("Primeiro resultado = " + a + "\n");
		// esse era o método de encapsulamento até java 5.

		// Após veremos método modificado.

		Integer y = 555;
		y++; // Nesse modo agora estaremos desempacotando, incrementando, e reempacotando

		System.out.println("Segudno resultadno = " + y + "\n");

		// podemos fazer comparações semprecisar v.booleanValue()
		// Podemos compara diretamente.
		Boolean v = new Boolean("true");
		if (v)
		{
			System.out.println(v);
		}

	}

}
