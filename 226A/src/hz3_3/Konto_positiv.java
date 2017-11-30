package hz3_3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Konto_positiv
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
    }

    public void verzinen()
    {
        k.einzahlen(200);
        Assert.assertEquals(k.getSaldo(),400,0);
        k.verzinsen(365);
        Assert.assertEquals(k.getSaldo(), 800,0);
    }
}
