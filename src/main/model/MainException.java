package main.model;

/**
 * Standaard exception voor het spel.
 * Niet dat het zal firen, sinds mijn code altijd error-free is baby :P
 *
 * @author LeventHAN
 */
public class MainException extends RuntimeException {
    public MainException(String s) {
        super(s);
    }

    public MainException(Throwable cause) {
        super(cause);
    }
}
