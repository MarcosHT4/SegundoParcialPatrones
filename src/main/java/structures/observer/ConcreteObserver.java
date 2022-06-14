package structures.observer;

public class ConcreteObserver implements IObserver {


    @Override
    public void update(String msg) {

        //Colocamos logica basados en el mensaje recibido
        System.out.println("ConcreteObserver tiene una notificación de un evento: " + msg);

    }
}
