package state.structure;

public class ConcreteState1 implements IState{

    //attributes, methods, etc...

    @Override
    public void handle() {

        //Logica para implementar el metodo del contexto
        System.out.println("ConcreteState1 > handle > ejecutando logica en el estado 1");
        //Mas logica...

    }
}
