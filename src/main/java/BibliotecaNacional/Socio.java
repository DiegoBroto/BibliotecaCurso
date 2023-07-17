package BibliotecaNacional;

public class Socio {
    private final String tipoDoc;
    private final Integer nroDoc;
    private final String nombre;
    private final String apellido;
    private final String domicilio;

    public Socio(String tipoDoc, Integer nroDoc, String nombre, String apellido, String domicilio) {
        this.tipoDoc = tipoDoc;
        this.nroDoc = nroDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }
}
