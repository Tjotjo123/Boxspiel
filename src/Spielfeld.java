import GLOOP.*;
public class Spielfeld{
    private GLQuader boden,wand1,wand2,wand3,wand4;
    private double breite, tiefe;

    public Spielfeld(double pBreite, double pTiefe){
        breite = pBreite;
        tiefe = pTiefe;
        boden = new GLQuader(0,100,0, breite,20,tiefe);
        boden.setzeTextur("src/img/Marmor.jpg");
        wand1 = new GLQuader(500,190,0, 50,200,1000);
        wand1.setzeTextur("src/img/Marmor.jpg");
        wand2 = new GLQuader(-500,190,0, 50,200,1000);
        wand2.setzeTextur("src/img/Marmor.jpg");
        wand3 = new GLQuader(0,190,-500, 1000,200,50);
        wand3.setzeTextur("src/img/Marmor.jpg");
        wand4 = new GLQuader(0,190,500, 1000,200,50);
        wand4.setzeTextur("src/img/Marmor.jpg");
    }
    public double gibX() {
        return wand1.gibX();
    }
    public double gibY() {
        return wand1.gibY();
    }
    public double gibZ() {
        return wand2.gibZ();
    }
    public double gibX2() {
        return wand2.gibX();
    }
    public double gibY2() {
        return wand2.gibY();
    }
    public double gibZ2() {
        return wand2.gibZ();
    }
    public double gibX3() {
        return wand3.gibX();
    }
    public double gibY3() {
        return wand3.gibY();
    }
    public double gibZ3() {
        return wand3.gibZ();
    }
    public double gibX4() {
        return wand4.gibX();
    }
    public double gibY4() {
        return wand4.gibY();
    }
    public double gibZ4() {
        return wand4.gibZ();
    }


    }

