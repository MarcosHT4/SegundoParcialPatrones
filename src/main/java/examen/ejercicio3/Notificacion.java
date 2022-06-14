package examen.ejercicio3;

public class Notificacion {

    private String contenido;
    private TipoNotificacion tipoNotificacion;

    public Notificacion(String contenido, TipoNotificacion tipoNotificacion) {
        this.contenido = contenido;
        this.tipoNotificacion = tipoNotificacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public TipoNotificacion getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(TipoNotificacion tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public void showInfo() {

        System.out.println("Notificacion: ");
        System.out.println("Contenido: " + contenido);
        System.out.println("Tipo de notifiacion: " + tipoNotificacion.toString());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

    }

}
