public class SchlechterCode {

    public static void main(String[] args) {
        if (pruefeBedingung(7, 12)==true) {
            System.out.println("Die Bedingung wurde erfüllt!");
        } else {
            System.out.println("Die Bedingung wurde nicht erfüllt!");
        }
    }

    public static boolean pruefeBedingung(int zahl1, int zahl2) {
        boolean wert=false;
        if (zahl1 > zahl2)
            wert = true;;
        return wert;
    }
}
