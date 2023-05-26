import GLOOP.*;
public class Box{
    private GLQuader quader; 

    private double vX,vZ;
    private double breite, tiefe;
    private GLTastatur tastatur;

    public Box() {
        quader = new GLQuader(0,150,0, 50,50,50);
        quader.setzeFarbe(1,0,0);

    }
    public void bewegelinks() {quader.verschiebe(4, 0, 0);}
    public void bewegerechts() {
        quader.verschiebe(-4, 0, 0);
    }

    public void bewegeoben() {
        quader.verschiebe(0, 0, 4);
    }

    public void bewegeunten() {
        quader.verschiebe(0, 0, -4);
    }

    public double gibX() {
        return quader.gibX();
    }

    public double gibY() {
        return quader.gibY();
    }

    public double gibZ() {
        return quader.gibZ();
    }

}
