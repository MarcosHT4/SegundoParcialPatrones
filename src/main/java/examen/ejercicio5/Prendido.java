package examen.ejercicio5;

import java.util.Arrays;
import java.util.Random;

public class Prendido implements IEstadoComputadora{
    @Override
    public void setStateComputadora(Computadora computadora) throws InterruptedException {

        int programasAbiertos = new Random().nextInt(10);

        for(int i = 0; i< programasAbiertos; i++) {

            computadora.getProgramasAbiertos()[i] = "Programa " + (i+1);

        }

        System.out.println("Se han abierto: " + programasAbiertos + " programas");
        System.out.println("Por lo tanto, los recursos aumentaran un: " + 5*programasAbiertos + "% ");

        while(computadora.getConsumoCPU() < 5*programasAbiertos && computadora.getConsumoRam() < 5*programasAbiertos) {

            computadora.setConsumoCPU(computadora.getConsumoCPU() + 5);
            computadora.setConsumoRam(computadora.getConsumoRam() + 5);

            computadora.showInfo();

            Thread.sleep(2000);




        }



    }
}
