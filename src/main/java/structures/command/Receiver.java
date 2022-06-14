package command.structure;

public class Receiver {

    private String atribute1;
    private String atribute2;
    private String atribute3;

    public Receiver() {

        atribute1 = "Mi atributo 1";
        atribute2 = "Mi atributo 2";
        atribute3 = "Mi atributo 3";

    }

    //Cada uno de los actions se convertira en clases de tipo ConcreteCommand, o incluso se pueden fusionar metodos
    //en una sola clase.

    public void action1() {

        //Cualquier logica de acuerdo a nuestro enunciado1


        System.out.println("Receiver>Action1");

    }
    public void action2() {

        System.out.println("Receiver>Action2");

    }
    public void action3() {

        System.out.println("Receiver>Action3");

    }

}
