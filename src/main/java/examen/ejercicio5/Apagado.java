package examen.ejercicio5;

import java.util.Arrays;

public class Apagado implements IEstadoComputadora{
    @Override
    public void setStateComputadora(Computadora computadora) {

        System.out.println("Apagando...");

        computadora.setConsumoRam(0);
        computadora.setConsumoCPU(0);
        Arrays.fill(computadora.getProgramasAbiertos(), "Cerrado");

        System.out.println("APAGADO!");

    }
}
