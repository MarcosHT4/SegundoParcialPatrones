package structures.state;

public class Context {

    private IState state;

    private String attribute1;
    private String attribute2;

    public Context() {}

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

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

    public void request() {  //Metodo que cambia internamente debido a los estados

        this.state.handle();



    }

}
