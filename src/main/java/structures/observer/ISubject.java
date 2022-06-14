package structures.observer;

public interface ISubject {

    //Agregar a los observadores

    void attach(IObserver observer);

    //Eliminar a algun observador;

    void detach(IObserver  observer);

    //Notifica a los observadores

    void notifyObservers(String msg);

}
