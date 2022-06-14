package chainResponsability.structure;

public class ConcreteHandler3 implements IHandler{

    private IHandler next; //El siguiente responsable de resolver el problema

    @Override
    public void setNext(IHandler handler) {

        next = handler;

    }

    @Override
    public void criteriaHandler(int amount) {

        //Logica cuando podemos solucionar el problema
        // Cuando responsables de solucionar problema
        // En este caso, si logra solucionar el problema, lo soluciona, y si no, lo manda al next
        if(amount >=200 && amount<300) {

            System.out.println("ConcreteHandler3 esta solucionando el problema... " +amount);

        } else {

            next.criteriaHandler(amount);

        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
