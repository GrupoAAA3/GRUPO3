package MisExcepciones;

public class VacioException extends Exception {
    private static String mensaje;

    public VacioException(String mensaje) {
        this.mensaje = mensaje;
    }

    public static String getMensaje() {
        return mensaje;
    }
    
}
