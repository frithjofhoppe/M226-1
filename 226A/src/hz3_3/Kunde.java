package hz3_3;

public class Kunde 
{
	private String vorname;
	private String name;
	private int kundennummer;

	Kunde(String vorname, String name, int kundennummer)
	{
		this.vorname = vorname;
		this.name = name;
		this.kundennummer = kundennummer;
	} 

	public int getKundennummer() {
		return kundennummer;
	}

	public String getVorname() {
		return vorname;
	}

	public String getName() {
		return name;
	}
}
