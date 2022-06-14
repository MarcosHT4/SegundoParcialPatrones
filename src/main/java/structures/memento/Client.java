package memento.structure;

public class Client {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator();

        ConcreteObject concreteObject;

        concreteObject = new ConcreteObject("Marcos", "State1");

        originator.setMemento(concreteObject); //Crear un momento basado en el ConcreteObjecto
        caretaker.addMemento(originator.createMemento());  //Guardar el momento [0]

        concreteObject = new ConcreteObject("Jose", "State2");

        originator.setMemento(concreteObject);

        concreteObject = new ConcreteObject("Maria", "State3");

        originator.setMemento(concreteObject);


        concreteObject = new ConcreteObject("Mario", "State4");

        originator.setMemento(concreteObject);
        caretaker.addMemento(originator.createMemento()); //[1]

        concreteObject = new ConcreteObject("Juan", "State5");

        originator.setMemento(concreteObject);

        concreteObject = new ConcreteObject("UPB", "State6");

        originator.setMemento(concreteObject);
        caretaker.addMemento(originator.createMemento()); //[2]


        concreteObject = originator.restoreMemento(caretaker.getMemento(0));
        System.out.println("VALORES ACTUALES: ");
        concreteObject.showInfo();






    }

}
