package examen.ejercicio5;

public class Computadora {

    private String[] programasAbiertos; //Hasta 10 programas abiertos
    private int consumoRam;
    private int consumoCPU;

    private IEstadoComputadora estadoComputadora;

    public Computadora() {

        programasAbiertos = new String[10];
        consumoRam = 50;
        consumoCPU = 50;


    }

    public String[] getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(String[] programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public int getConsumoRam() {
        return consumoRam;
    }

    public void setConsumoRam(int consumoRam) {
        this.consumoRam = consumoRam;
    }

    public int getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(int consumoCPU) {
        this.consumoCPU = consumoCPU;
    }

    public IEstadoComputadora getEstadoComputadora() {
        return estadoComputadora;
    }

    public void setEstadoComputadora(IEstadoComputadora estadoComputadora) {
        this.estadoComputadora = estadoComputadora;
    }

    public void computadoraResourceManager() {

        estadoComputadora.setStateComputadora(this);

    }

    public void showInfo() {

        System.out.println("Computadora: ");
        System.out.print("Programas abiertos: ");

        for(String programa : programasAbiertos) {

            System.out.println(programa + ", ");

        }

        System.out.println("Consumo CPU: " + consumoCPU) ;
        System.out.println("Consumo RAM: " + consumoRam);

    }

}
