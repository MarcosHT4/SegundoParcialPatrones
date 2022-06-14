package structures.command;

public class Client {

    public static void main(String[] args){

        Receiver receiver = new Receiver();

        ConcreteCommand1 concreteCommand1 = new ConcreteCommand1(receiver);
        ConcreteCommand2 concreteCommand2 = new ConcreteCommand2(receiver);
        ConcreteCommand3 concreteCommand3 = new ConcreteCommand3(receiver);

        Invoker invoker = new Invoker();

        invoker.addCommands(concreteCommand1);
        invoker.addCommands(concreteCommand2);
        invoker.addCommands(concreteCommand3);
        invoker.addCommands(concreteCommand1);

        invoker.runCommands();



    }


}
