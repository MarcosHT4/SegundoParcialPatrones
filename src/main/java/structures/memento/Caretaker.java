package memento.structure;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    //Objeto que almacena momentos/estados
    private List<Memento> stateList = new ArrayList<>();

    public void addMemento(Memento memento) {

        stateList.add(memento);

    }

    //Forma de obtener objetos de nuestro almacenador de datos -----> LIST

    public Memento getMemento(int index) {

        return stateList.get(index);

    }



}
