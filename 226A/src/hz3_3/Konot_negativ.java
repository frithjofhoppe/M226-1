package hz3_3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Konot_negativ
{

    Konto k;

    @Before
    public void init()
    {
        k = new Konto(200,"Max","Mustermann",1);
    }

    @Test
    public void einzahlen_zuGross()
    {
        k.einzahlen(2001);
        //Obere Grenze => nicht grösser als 2000 pro Einzahlung
        Assert.assertEquals(k.getSaldo(),200,0);

    }

    @Test
    public void einzahlen_negativ()
    {
        k.einzahlen(-5);
        //Untere Grenze => keine negativen Einzahlungen
        Assert.assertEquals(k.getSaldo(),200,0);
    }

    @Test
    public void verzinsen_negativ()
    {
        k.verzinsen(-26);
        //Untere Grenze => keine negativen Werte für die Anzahl Tage
        Assert.assertEquals(k.getSaldo(), 200,0);
    }
}
