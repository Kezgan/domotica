package ar.edu.unahur.obj2;

public class EncenderLuzTecho implements Command {

    private LuzTecho luzTecho;

    public EncenderLuzTecho(LuzTecho luzTecho) {
        this.luzTecho = luzTecho;
    }

    public void execute() {
        luzTecho.on();
    }
}
