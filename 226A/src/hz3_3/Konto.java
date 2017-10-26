package hz3_3;

public class Konto 
{
	private double saldo = 0;
	private double zinssatz = 1;
	private Kunde inhaber;
	
	Konto(double saldo)
	{
		this.saldo = saldo;
	}
	
	Konto(double saldo, String vorname, String nachname, int kundennummer)
	{
		this.saldo = saldo;
		inhaber = new Kunde(vorname,nachname,kundennummer);
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
	
	public String toString()
	{
		String back = "";
		
		back = ">>> Inhaber \n"   + "Vorname: " +inhaber.getVorname() +"\nNachname: "+inhaber.getName() +"\n \n Kundennummer: "+inhaber.getKundennummer();
		back += ">>> Saldo: "+ getSaldo();
		
		return back;
	}
}
