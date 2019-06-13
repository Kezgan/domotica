package ar.edu.unahur.obj2;

public class ApagarLuzJardin implements Command {

    private LuzJardin luzJardin;

    public ApagarLuzJardin(LuzJardin luzJardin) {
        this.luzJardin = luzJardin;
    }

    public void execute() {
        luzJardin.manualOff();
    }
}
