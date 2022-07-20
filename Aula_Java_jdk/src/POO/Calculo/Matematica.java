package POO.Calculo;

public class Matematica
{
	/*
	 * Método com Retorno
	 */

	/**
	 * @param um
	 * @param dois
	 * @param return
	 * */

	int maior(int um, int dois)
	{
		if (um > dois)
		{
			return um;

		}
		else
		{
			return dois;
		}
	}

	double soma(double um, double dois)
	{
		double s = um + dois;
		return s;
	}
}
