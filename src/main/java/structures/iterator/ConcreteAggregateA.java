package iterator.structure;

public class ConcreteAggregateA implements  IAggregate {

    //Logica de algun objeto que almacena objetos, en este caso, hagamos que ConcreteAggregateA sea un array

    private String[] name;
    private int position;

    public ConcreteAggregateA() { //Inicializamos el tamano del arreglo

        name = new String[5];

    }

    public void add(String value) { //Ponemos un metodo para añadir elementos

        name[position] = value;
        position++;

    }

    @Override
    public ConcreteIteratorA createIterator() {

        return new ConcreteIteratorA(name);

    }



}
