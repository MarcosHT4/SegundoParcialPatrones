package examen.ejercicio3;

public class Client {

    public static void main(String[] args) {

        PaginaWeb paginaWeb = new PaginaWeb();

        User user1 = new User("Dalas", PreferenciaUsuario.IMAGEN);
        User user2 = new User("Javi", PreferenciaUsuario.IMAGEN);
        User user3 = new User("Shur", PreferenciaUsuario.VIDEO);
        User user4 = new User("Lada", PreferenciaUsuario.VIDEO);
        User user5 = new User("Nauter", PreferenciaUsuario.TODO);

        paginaWeb.attach(user1);
        paginaWeb.attach(user2);
        paginaWeb.attach(user3);
        paginaWeb.attach(user4);
        paginaWeb.attach(user5);


        Notificacion notificacion1 = new Notificacion("Nuevo video!", TipoNotificacion.VIDEO);
        Notificacion notificacion2 = new Notificacion("Nueva imagen!", TipoNotificacion.IMAGEN);

        paginaWeb.subirImagen("Imagen de perros");

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        paginaWeb.subirVideo("Video de perrtos");






    }

}
