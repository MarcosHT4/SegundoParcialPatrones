package examen.ejercicio2;

public class Estudiante extends Jugador{
    public Estudiante(IChatJuegos chatJuegos, String alias, String nombre, String ranking) {
        super(chatJuegos, alias, nombre, ranking);
    }

    @Override
    public void send(String msg) {

        chatJuegos.send(msg, this);

    }

    @Override
    public void received(String msg) {

        System.out.println("INFO: El estudiante: " + getNombre() + ", recibe el siguiente mensaje: " + msg);

    }
}
