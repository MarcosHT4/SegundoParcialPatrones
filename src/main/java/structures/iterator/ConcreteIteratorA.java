package structures.iterator;

public class ConcreteIteratorA implements Iterator{

    //Tenemos que manejar la logica del CocnreteAggregatorA

    private int position;
    private String[] name;

    public ConcreteIteratorA(String[] name) {

        this.name = name;
        position = 0;

    }

    @Override
    public Object next() {
        return name[position++];
    }

    @Override
    public boolean hasNext() {
        return name.length !=0 && position < name.length; //Verificamos que haya objetos, y que ademas, nuestra posicion actual en menor al tamanio del arreglo.
    }
}
