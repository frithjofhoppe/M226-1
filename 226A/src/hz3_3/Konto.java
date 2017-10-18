package hz3_3;

public class Konto 
{
	private double saldo = 0;
	private double zinssatz = 1;
	
	Konto(double saldo)
	{
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void einzahlen(double wert)
	{
		saldo+=wert;
	}
	
	public void verzinsen(double tag)
	{
		double zins = saldo * zinssatz * (tag/365);
		saldo += zins;
	}
}
