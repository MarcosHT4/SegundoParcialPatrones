package examen.ejercicio2;

public class Client {

    public static void main(String[] args) {

        ChatJuegosMismoEquipo chatJuegosMismoEquipo = new ChatJuegosMismoEquipo();
        ChatJuegoDiferenteEquipo chatJuegoDiferenteEquipo = new ChatJuegoDiferenteEquipo();

        Estudiante estudiante1 = new Estudiante(chatJuegosMismoEquipo, "Dalas", "Daniel", "8");
        Estudiante estudiante2 = new Estudiante(chatJuegosMismoEquipo, "Javi", "Javier", "5");
        Estudiante estudiante3 = new Estudiante(chatJuegosMismoEquipo, "Lada", "Laura", "4");
        Estudiante estudiante4 = new Estudiante(chatJuegosMismoEquipo, "Nauter", "Marcos", "1");

        Docente docente1 = new Docente(chatJuegosMismoEquipo, "Pepe", "Jose", "5");
        Docente docente2 = new Docente(chatJuegosMismoEquipo, "Wismichu", "Ismael", "9");
        Docente docente3 = new Docente(chatJuegosMismoEquipo, "Miare", "Maria", "7");
        Docente docente4 = new Docente(chatJuegosMismoEquipo, "Jason", "Jorge", "1");

        chatJuegosMismoEquipo.addJugador(estudiante1).addJugador(estudiante2).addJugador(estudiante3).addJugador(estudiante4)
                .addJugador(docente1).addJugador(docente2).addJugador(docente3).addJugador(docente4);


        estudiante1.send("Hola a mis amigos!");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");
        docente2.send("Hola a mis colegas docentes!");



        estudiante1.setChatJuegos(chatJuegoDiferenteEquipo);
        estudiante2.setChatJuegos(chatJuegoDiferenteEquipo);
        estudiante3.setChatJuegos(chatJuegoDiferenteEquipo);
        estudiante4.setChatJuegos(chatJuegoDiferenteEquipo);

        docente1.setChatJuegos(chatJuegoDiferenteEquipo);
        docente2.setChatJuegos(chatJuegoDiferenteEquipo);
        docente3.setChatJuegos(chatJuegoDiferenteEquipo);
        docente4.setChatJuegos(chatJuegoDiferenteEquipo);


        chatJuegoDiferenteEquipo.addJugador(estudiante1).addJugador(estudiante2).addJugador(estudiante3).addJugador(estudiante4)
                .addJugador(docente1).addJugador(docente2).addJugador(docente3).addJugador(docente4);

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        docente1.send("Hola a los estudiantes");
        estudiante4.send("Hola a los docentes");




    }








}
