package main;

public class Auto {

    private static int peldanyDb = 0;
    private boolean uzemanyag;
    private boolean beinditva;

    public Auto() {
        this(false);
    }

    public Auto(boolean beinditva) {
        this(true, beinditva);
    }

    public Auto(boolean uzemanyag, boolean beinditva) {
        this.uzemanyag = uzemanyag;
        this.beinditva = beinditva;
        Auto.peldanyDb++;

        System.out.printf("Az %d. verzió\n", peldanyDb);
        System.out.println("Üzemanyag: " + uzemanyag);
        System.out.println("Beindítva: " + beinditva);
        System.out.println("---------------------");
    }

    public void setBeindit(boolean beindit) {

    }

    public void megy() {

    }

    public void tankol() {

    }
}
