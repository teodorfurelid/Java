package no.hvl.dat100;
import static javax.swing.JOptionPane.*;


public class ifelselokke {
    public static void main(String[] args) {

        //Her skriver vi inn løkker som gjer det mulig
        //å få eit input fra bruker
        String tallstreng = showInputDialog("Tall?");
        int tall = Integer.parseInt(tallstreng);

        //Kode som viser om taler er posetivt (større en 0)
        //eller ikkje posetivt
        if (tall > 0) {
            System.out.println(tall + " er positiv");
        } else {
            System.out.println(tall + " er negativ");
        }

        System.out.println("Etter valgsetning");
    }
}
