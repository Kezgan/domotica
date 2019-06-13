package ar.edu.unahur.obj2;

public class ApagarLuzTecho implements Command {

    private LuzTecho luzTecho;

    public ApagarLuzTecho(LuzTecho luzTecho) {
        this.luzTecho = luzTecho;
    }

    public void execute() {
        luzTecho.off();
    }
}
