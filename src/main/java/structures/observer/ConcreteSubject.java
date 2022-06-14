package structures.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject{

    private List<IObserver> observers = new ArrayList<>();
    private String attribute1;
    private String attribute2;
    private String attribute3;

    public ConcreteSubject() {}

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public void action1() {

        System.out.println("ConcreteSubject> Action1");
        this.notifyObservers("Action1 utilizada");

    }

    public void action2() {

        System.out.println("ConcreteSubject> Action2");
        this.notifyObservers("Action2 utilizada");

    }


    @Override
    public void attach(IObserver observer) {

        observers.add(observer);

    }

    @Override
    public void detach(IObserver observer) {

        observers.remove(observer);

    }

    @Override
    public void notifyObservers(String msg) { //Este metodo es el que tiene que ser llamado cuando ocurra alguna accion

        for(IObserver observer : observers) {

            observer.update("INFO> Evento " + msg );

        }

    }
}
