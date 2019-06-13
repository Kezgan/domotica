package ar.edu.unahur.obj2;

public class EncenderLuzJardin implements Command {

    private LuzJardin luzJardin;

    public EncenderLuzJardin(LuzJardin luzJardin) {
        this.luzJardin = luzJardin;
    }

    public void execute() {
        luzJardin.manualOn();
    }

}
