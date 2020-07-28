package Vampiros;

public class Gamble {
	public Integer v1;
	public Integer v2;
	public Integer atc;
	public Integer dn;

	public double dados;

	public Gamble() {}//construct

	public double gamePlay(int n1, int n2, int at) {
		if (at == 3)
			return (double) n1 / (double) (n1 + n2);
		else
			dados = 1.0 - (6 - at) / 6.0;
			dados = (1 - dados) / dados;
			return (1.0 - Math.pow(dados, n1)) / (1.0 - Math.pow(dados, n1 + n2));
	}
}
