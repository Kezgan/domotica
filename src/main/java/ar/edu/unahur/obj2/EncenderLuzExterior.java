package ar.edu.unahur.obj2;

public class EncenderLuzExterior implements Command {

    private LuzExterior luzExterior;

    public EncenderLuzExterior(LuzExterior luzExterior) {
        this.luzExterior = luzExterior;
    }

    public void execute() {
        luzExterior.on();
    }

}
