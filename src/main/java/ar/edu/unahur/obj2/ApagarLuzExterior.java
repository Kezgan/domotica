package ar.edu.unahur.obj2;

public class ApagarLuzExterior implements Command {

    private LuzExterior luzExterior;

    public ApagarLuzExterior(LuzExterior luzExterior) {
        this.luzExterior = luzExterior;
    }

    public void execute() {
        luzExterior.off();
    }

}
