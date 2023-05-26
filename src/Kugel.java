import GLOOP.*;
public class Kugel{
    private GLKugel kugel;
    private Box dieBox;
    private Spielfeld wand;
    private GLTastatur tastatur;
    
    private double radius,distance;
    private boolean istAktiv;
    private double vX, vZ;
    private double px =(Math.random()*3);
    private double pz =(Math.random())*3;

    public Kugel(Spielfeld pWand,Box pBox){
        kugel = new GLKugel((Math.random()*700-400), 150, (Math.random()*850-400) , 30);
        kugel.setzeFarbe(0,1,0);
        wand = pWand;
        dieBox=pBox;}


public void Richtungswechsel(){
     if (kugel.gibX()>=wand.gibX() -50||kugel.gibX()<=wand.gibX2()+50) {
            px=px * (-1);
     }
    if (kugel.gibZ()<=wand.gibZ3()+50||kugel.gibZ()>=wand.gibZ4()-50) {
        pz=pz * (-1);
    }
     }








        public double gibX() {
            return kugel.gibX();
        }

        public double gibY() {
            return kugel.gibY();
        }

        public double gibZ() {
            return kugel.gibZ();
        }
    public void bewegeDich() {
        kugel.verschiebe(px, 0, pz);

        }
        public void setzeSichtbarkeit(boolean p){
        kugel.setzeSichtbarkeit(p);
        }
    public boolean treffer () {
           distance = Math.sqrt(Math.pow(kugel.gibX() - dieBox.gibX(), 2) + Math.pow(kugel.gibY() - dieBox.gibY(), 2) +
                    Math.pow(kugel.gibZ() - dieBox.gibZ(), 2));

        if (distance < 50) {
            return true;
        } else {
            return false;
        }
    }
        
    }



