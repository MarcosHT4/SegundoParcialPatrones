package memento.structure;

public class Originator {

    private ConcreteObject state;

    public void setMemento(ConcreteObject state) {
        System.out.println("Originator> Set state " + state.getState());
        this.state = state;

    }

    public Memento createMemento() {

        return new Memento(state);

    }

    public ConcreteObject restoreMemento(Memento memento) {

        this.state =  memento.getState();
        return this.state;


    }




}
