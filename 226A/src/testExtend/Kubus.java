package testExtend;

public class Kubus extends Form
{
    int hoehe;

    public Kubus(int leange, int breite) {
        super(leange, breite);
    }

    public Kubus(int leange, int breite, int hoehe) {
        super(leange, breite);
        this.hoehe = hoehe;
    }

    public int getLaenge()
    {
        return this.leange;
    }
}
