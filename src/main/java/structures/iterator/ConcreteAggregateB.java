package iterator.structure;

import java.util.Vector;

public class ConcreteAggregateB implements  IAggregate {

    //Logica de algun objeto que almacena objetos, en este caso, hagamos que ConcreteAggregateB sea un vector

    private Vector<String> name;


    public ConcreteAggregateB() { //Inicializamos el vector

        name = new Vector<>();

    }

    public void add(String value) { //Ponemos un metodo para añadir elementos

        name.add(value);

    }

    @Override
    public ConcreteIteratorB createIterator() {

        return new ConcreteIteratorB(name);

    }



}
