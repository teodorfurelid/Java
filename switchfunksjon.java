package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class switchfunksjon {

    public static void main(String[] args) {

        //String tallStreng = showInputDialog("Tall?");
        //int mndNr = Integer.parseInt(tallStreng);

        int mndNr = 0;
        String mndNamn = "";

        //Skal gi mndNamn rett verdi, 1 -> "Januar", osv.
        switch (mndNr) {
        case 1:
            mndNamn = "Januar";
            break;
        case 2:
            mndNamn = "Februar";
            break;
        case 3:
            mndNamn = "Mars";
            break;
        case 4:
            mndNamn = "April";
            break;
        case 5:
            mndNamn = "Mai";
            break;
        case 6:
            mndNamn = "Juni";
            break;
        case 7:
            mndNamn = "Juli";
            break;
        case 8:
            mndNamn = "August";
            break;
        case 9:
            mndNamn = "September";
            break;
        case 10:
            mndNamn = "Oktober";
            break;
        case 11:
            mndNamn = "November";
            break;
        case 12:
            mndNamn = "Desember";
            break;
        default:
            mndNamn = "Ulovlig månadnr";
        }

        System.out.println(mndNamn);
    }

}