import static java.lang.Math.PI;
// gi programmet tilgang til Scanner biblioteket
import java.util.Scanner;

public class B1 {

    public static void main(String args[]) {

        // opprettet en ny (new) scanner for tastatur (System.in)
        Scanner in = new Scanner(System.in);
        System.out.print("Skrive radius: ");
        // les inn
        int radius = in.nextInt();

        System.out.print("Skriv hogd; ");
        int hogd = in.nextInt();

        double volum = (PI*(radius^2)*hogd);

        System.out.println(volum + " m^3");

        // lukk scanneren igjen
        in.close();
    }
}
