package examen.ejercicio1;

public class Archivo {

    private String id;
    private String contenidoDocumento;

    private String nuevoContenido;

    public Archivo(String id, String contenidoDocumento, String nuevoContenido) {
        this.id = id;
        this.contenidoDocumento = contenidoDocumento;
        this.nuevoContenido = nuevoContenido;
    }

    public String getNuevoContenido() {
        return nuevoContenido;
    }

    public void setNuevoContenido(String nuevoContenido) {
        this.nuevoContenido = nuevoContenido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContenidoDocumento() {
        return contenidoDocumento;
    }

    public void setContenidoDocumento(String contenidoDocumento) {
        this.contenidoDocumento = contenidoDocumento;
    }

    public void showInfo() {

        System.out.println("Archivo: ");
        System.out.println("ID archivo: " + id);
        System.out.println("Contenido del arhcivo: " + contenidoDocumento);

    }

}
