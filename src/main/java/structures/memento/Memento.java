package structures.memento;

public class Memento {

    private ConcreteObject state;

    public Memento(ConcreteObject concreteObject) {

        this.state = concreteObject;


    }

    public ConcreteObject getState() {

        return state;

    }



}
