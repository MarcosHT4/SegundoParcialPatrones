package structures.state;

public class Client {

    public static void main(String[] args){

        Context context = new Context();

        context.setState(new ConcreteState1());
        context.request();
        context.setState(new ConcreteState2());
        context.request();
        context.setState(new ConcreteState3());
        context.request();



    }
}
