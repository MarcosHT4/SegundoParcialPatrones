package examen.ejercicio3;

public interface IPaginaWeb {

    void attach(IUser user);
    void dettach(IUser user);
    void notify(String msg, Notificacion notificacion);

}
