import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Methodes {
    public static Scanner invoer = new Scanner(System.in);
    public static String[] users = {"User1", "User2", "User3"};


    public static String naam;

    public static float beginBedrag;
    public static float maandRente;

    public static int index;
    public static int maand;
    public static int jaar;



    public static void main(String[] args) {
        helloWorld();

        groet();
        groet(naam);


        berekenEindBedrag();
    }

    private static void berekenEindBedrag() {
        // Jaarlijkse weergave van spaargeld met maandelijkse rente.
        System.out.print("\n――――――――――――――――――――――――――――――――――\n");
        System.out.print("SPAARGELD BEREKENEN");
        System.out.print("\n――――――――――――――――――――――――――――――――――\n");
        System.out.print("\nVoer een bedrag in: ");
        beginBedrag = invoer.nextFloat();

        System.out.print("\nVoer een maandrente in: ");
        maandRente = invoer.nextFloat();

        for (jaar = 1; jaar <= 10; jaar++) {
            String pattern = "###,###.##";
            DecimalFormat decimalFormat = new DecimalFormat(pattern);
            String format = decimalFormat.format((beginBedrag * Math.pow((1 + (maandRente / 100)), 12*jaar)));
            System.out.printf("\nBeste %s, uw bedrag bedraagt na %d jaar: %s", naam, jaar, format);
        }
        System.out.print("\n――――――――――――――――――――――――――――――――――\n");
    }

//    private static void groet(String naam) {
//        System.out.print("\n――――――――――――――――――――――――――――――――――\n");
//        System.out.print("\nVoer je naam in: ");
//        naam = invoer.nextLine();
//        System.out.print("\nHallo, " + naam + "!\n");
//    }

    private static String groet(String naam) {
        System.out.print("\n――――――――――――――――――――――――――――――――――\n");
        System.out.print("\nVoer je naam in: ");
        naam = invoer.nextLine();
        System.out.print("\nHallo, " + naam + "!\n");
        return groet(naam);
    }


    private static void groet() {
        System.out.print("\n――――――――――――――――――――――――――――――――――\n");
        for (index = 0; index < users.length; index++) {
            System.out.print("\nHallo, " + users[index] + "!\n");
        }
    }

    private static void helloWorld() {
        System.out.print("\n――――――――――――――――――――――――――――――――――\n");
        System.out.print("\nHello World\n");
    }


}

//        DecimalFormat format = (DecimalFormat) DecimalFormat.getInstance();
//        DecimalFormatSymbols symbols = format.getDecimalFormatSymbols();
//        char sep = symbols.getDecimalSeparator();
//
//        //create a new instance
//        DecimalFormatSymbols custom = new DecimalFormatSymbols();
//        custom.setDecimalSeparator('.');
//        format.setDecimalFormatSymbols(custom);

//        numberFormatting();