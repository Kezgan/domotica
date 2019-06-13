package ar.edu.unahur.obj2;

public class ApagarPuertaGarage implements Command {

    private PuertaGarage puertaGarage;

    public ApagarPuertaGarage(PuertaGarage puertaGarage) {
        this.puertaGarage = puertaGarage;
    }

    public void execute() {
        puertaGarage.apagarLuz();
        puertaGarage.abajo();
    }
}
