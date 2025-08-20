//gir programmet tilgang til scanner biblioteket
import java.util.Scanner;

public class B3tidkalkulator {
    public static void main(String args[]) {

        //Her skal vi ha ein scanner som tar input
        Scanner in = new Scanner(System.in);
        System.out.print("Skriv inn antall sekund: ");

        //Leser inn tall:
        //int tall = in.nextInt();
        //kan også nytt meg av funksjonen over
        int tall = 3690;


        //funksjon som tar  tall og
        int time = (tall/3600);
        int resttime = (tall % 3600);
        int resttimeimin = (resttime/60);
        int restsekund = (resttime%60);

        System.out.println("Når man skriver antall sekund --> " + tall + " får man dette:");
        System.out.print(time + "t " + resttimeimin + "min " + restsekund + "sekund ");

        in.close();
    }
}
