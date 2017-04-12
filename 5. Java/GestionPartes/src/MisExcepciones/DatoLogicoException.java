package MisExcepciones;

public class DatoLogicoException extends Exception {
    private static String mensaje;

    public DatoLogicoException(String mensaje) {
        this.mensaje = mensaje;
    }

    public static String getMensaje() {
        return mensaje;
    }
    
}
