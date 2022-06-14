package examen.ejercicio5;

public class Client {

    public static void main(String[] args) throws InterruptedException {


        Computadora computadora = new Computadora();

        computadora.setEstadoComputadora(new Apagado());

        computadora.computadoraResourceManager();

        computadora.showInfo();

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        computadora.setEstadoComputadora(new Reiniciar());


        computadora.computadoraResourceManager();

        computadora.showInfo();

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        computadora.setEstadoComputadora(new Prendido());

        computadora.computadoraResourceManager();



    }

}
