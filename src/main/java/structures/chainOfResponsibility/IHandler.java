package chainResponsability.structure;

public interface IHandler {

    void setNext(IHandler handler); //Quien sera el siguiente responsable
    void criteriaHandler(int amount); //El criterio del problema, el valor del argumento cambia segun el problema, recibir el problema
    IHandler next();
}
