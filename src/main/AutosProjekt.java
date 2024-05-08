package main;

public class AutosProjekt {

    private static AutosProjekt prg = new AutosProjekt();
    
    public static void main(String[] args) {
        prg.bemutatok();
    }

    private void bemutatok() {
        prg.bemutato_0();
        prg.bemutato_1();
        prg.bemutato_2();
    }
 
    private void bemutato_0() {
        new Auto();
    }

    private void bemutato_1() {
        new Auto(true);
    }

    private void bemutato_2() {
        new Auto(false, false);
    }

}
