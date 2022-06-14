package iterator.structure;

import java.util.Vector;

public class ConcreteIteratorB implements Iterator{

    //Tenemos que manejar la logica del CocnreteAggregatorB

    private int position; //En este caso, esto es extra para poder iterar
    private Vector<String> name;

    public ConcreteIteratorB(Vector<String> name) {

        this.name = name;
        position = 0;

    }

    @Override
    public Object next() {
        return name.get(position++);
    }

    @Override
    public boolean hasNext() {
        return name.size() !=0 && position < name.size(); //Verificamos que haya objetos, y que ademas, nuestra posicion actual en menor al tamanio del vector.
    }
}
