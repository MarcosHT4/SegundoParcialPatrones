package examen.ejercicio3;

public class User implements IUser{

    private String userName;
    private PreferenciaUsuario preferenciaUsuario;

    public User(String userName, PreferenciaUsuario preferenciaUsuario) {
        this.userName = userName;
        this.preferenciaUsuario = preferenciaUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PreferenciaUsuario getPreferenciaUsuario() {
        return preferenciaUsuario;
    }

    public void setPreferenciaUsuario(PreferenciaUsuario preferenciaUsuario) {
        this.preferenciaUsuario = preferenciaUsuario;
    }

    @Override
    public void update(String msg, Notificacion notificacion) {

        System.out.println("El usuario " + userName + ", recibe la notificacion: " + notificacion.getContenido() + " junto con el mensaje: " + msg);

    }


}
