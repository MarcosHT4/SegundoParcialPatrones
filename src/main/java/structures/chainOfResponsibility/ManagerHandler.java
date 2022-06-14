package chainResponsability.structure;

public class ManagerHandler implements IHandler{

    //El ManagerHandler desgina el orden de la cadena

    private IHandler next;


    @Override
    public void setNext(IHandler handler) {

        next = handler;

    }

    @Override
    public void criteriaHandler(int amount) {

        ConcreteHandler1 responsable1 = new ConcreteHandler1();
        this.setNext(responsable1); //El next del manager es el primero en solucionar el problema
        ConcreteHandler2 responsable2 = new ConcreteHandler2();
        responsable1.setNext(responsable2); //Si el responsable1 no lo logra, su siguiente sera el responsable2
        ConcreteHandler3 responsable3 = new ConcreteHandler3();
        responsable2.setNext(responsable3);
        ConcreteHandler4 responsable4 = new ConcreteHandler4();
        responsable3.setNext(responsable4);

        this.next.criteriaHandler(amount);

    }

    @Override
    public IHandler next() {
        return next;
    }
}
