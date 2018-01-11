package hz3_3.exception;

public class EinzahlFehler extends RuntimeException {
    public EinzahlFehler() {
    }

    public EinzahlFehler(String message) {
        super(message);
    }

    public EinzahlFehler(String message, Throwable cause) {
        super(message, cause);
    }

    public EinzahlFehler(Throwable cause) {
        super(cause);
    }

    public EinzahlFehler(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
