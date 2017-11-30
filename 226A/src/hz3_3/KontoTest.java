package hz3_3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KontoTest
{
    Konto k;

    @Before
    public void init()
    {
         k = new Konto(200,"Max","Mustermann",1);
    }

    @Test
    public void einzahlen()
    {
        k.einzahlen(200);
        //Repräsentiert Einzahlung für jegliche BEträge zwischen 1 und 2000
        Assert.assertEquals(k.getSaldo(), 400,0);

        k.einzahlen(2001);
        //Obere Grenze => nicht grösser als 2000 pro Einzahlung
        Assert.assertEquals(k.getSaldo(),400,0);

        k.einzahlen(-5);
        //Untere Grenze => keine negativen Einzahlungen
        Assert.assertEquals(k.getSaldo(),400,0);
    }

    @Test
    public void verzinsen()
    {
        k.einzahlen(200);
        Assert.assertEquals(k.getSaldo(),400,0);
        k.verzinsen(365);
        Assert.assertEquals(k.getSaldo(), 800,0);
//        k.einzahlen(800);
//        k.verzinsen(365);
//        Assert.assertEquals(k.getSaldo(),3200,0);
        k.verzinsen(-26);
        //Untere Grenze => keine negativen Werte für die Anzahl Tage
        Assert.assertEquals(k.getSaldo(), 800,0);
    }
}
