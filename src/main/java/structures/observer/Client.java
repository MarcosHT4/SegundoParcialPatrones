package structures.observer;

public class Client {

    public static void main(String[] args) {

        ConcreteSubject concreteSubject = new ConcreteSubject();

        concreteSubject.attach(new ConcreteObserver());
        concreteSubject.attach(new ConcreteObserver());
        concreteSubject.attach(new ConcreteObserver1());
        concreteSubject.attach(new ConcreteObserver1());

        concreteSubject.action1();
        concreteSubject.action2();




    }

}
