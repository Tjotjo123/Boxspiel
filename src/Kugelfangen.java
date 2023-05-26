import GLOOP.*;
public class Kugelfangen {
    private GLKamera kamera;
    private GLEntwicklerkamera entwicklerkamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLQuader Tisch;
    private GLTastatur tastatur;
    private Kugel[] kugel;
    private Box dieBox;
    private Spielfeld wand;
    double distance;


    public Kugelfangen() {
        kamera = new GLKamera();
        kamera.setzePosition(0, 1200, -400);
        kamera.setzeBlickpunkt(0,0,0);

        licht = new GLLicht();
        licht.setzePosition(0,4000,0);


        himmel = new GLHimmel("src/img/Sterne.jpg");
        Tisch = new GLQuader(0,-200,0,3000,1,3000,"src/img/Holz.jpg");
        tastatur = new GLTastatur();

        wand = new Spielfeld(1000, 1000);
        dieBox = new Box();
        kugel = new Kugel[10];
        for(int i = 0; i < kugel.length; i++){
            kugel[i] = new Kugel(wand,dieBox);}






        fuehreAus();


    }






    public void fuehreAus() {


        while (!tastatur.esc()) {

            for (int i = 0; i < kugel.length; i++) {

                System.out.println(555);
                kugel[i].Richtungswechsel();
                Sys.warte();
                kugel[i].bewegeDich();
                if(kugel[i].treffer()) {
                  kugel[i].setzeSichtbarkeit(false);
                }
                }

                if ((tastatur.istGedrueckt('a')) && (dieBox.gibX() < 450)) {

                    dieBox.bewegelinks();
                }
                if ((tastatur.istGedrueckt('d')) && (dieBox.gibX() > -450)) {

                    dieBox.bewegerechts();
                }
                if ((tastatur.istGedrueckt('w')) && (dieBox.gibZ() < 450)) {

                    dieBox.bewegeoben();
                }

                if ((tastatur.istGedrueckt('s')) && (dieBox.gibZ() > -450)) {

                    dieBox.bewegeunten();
                }


            }


    }}







