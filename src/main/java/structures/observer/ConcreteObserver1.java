package observer.structure;

public class ConcreteObserver1 implements IObserver{
    @Override
    public void update(String msg) {

        System.out.println("ConcreteObserver1 tiene una notifcacion de evento: " +  msg );

    }
}
