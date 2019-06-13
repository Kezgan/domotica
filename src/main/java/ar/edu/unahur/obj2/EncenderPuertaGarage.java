package ar.edu.unahur.obj2;

public class EncenderPuertaGarage implements Command {

    private PuertaGarage puertaGarage;

    public EncenderPuertaGarage(PuertaGarage puertaGarage) {
        this.puertaGarage = puertaGarage;
    }

    public void execute() {
        puertaGarage.encenderLuz();
        puertaGarage.arriba();
    }
}
