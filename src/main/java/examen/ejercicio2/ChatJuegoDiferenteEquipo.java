package examen.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ChatJuegoDiferenteEquipo implements IChatJuegos{

    private List<Jugador> jugadorList = new ArrayList<>();

    public ChatJuegoDiferenteEquipo addJugador(Jugador jugador) {

        jugadorList.add(jugador);
        return this;

    }


    @Override
    public void send(String msg, Jugador jugador) {

        for(Jugador jugadorColega : jugadorList) {

            if(jugador.getClass().getName().contains("Estudiante")) {

                Estudiante estudiante = (Estudiante) jugador;

                if(!estudiante.getAlias().equals(jugadorColega.getAlias())) {

                    if(jugadorColega.getClass().getName().contains("Docente")) {

                        jugadorColega.received(msg);

                    }

                }

            } else if(jugador.getClass().getName().contains("Docente")) {

                Docente docente = (Docente) jugador;

                if(!docente.getAlias().equals(jugadorColega.getAlias())) {

                    if(jugadorColega.getClass().getName().contains("Estudiante")) {

                        jugadorColega.received(msg);

                    }

                }

            }

        }

    }
}
