package hz3_3;

public class TestKonto {

	public static void main(String[] args) 
	{
		Konto k1 = new Konto(500.75);
		k1.verzinsen(365);
		
		Konto k2 = new Konto(720.50,"Max","Mustermann",23);
		System.out.println(k2.toString());
//		k2.verzinsen(750);
//		System.out.println(k2.getSaldo());
//		k2.einzahlen(200);
//		System.out.println(k2.getSaldo());
		
	}

}
