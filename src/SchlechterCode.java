public class SchlechterCode {

    public static void main(String[] args) {
        boolean ergebnis = pruefeBedingung(7, 12);
        if (ergebnis) {
            System.out.println("Die Bedingung wurde erfüllt!");
        } else {
            System.out.println("Die Bedingung wurde nicht erfüllt!");
        }
    }

    public static boolean pruefeBedingung(int zahl1, int zahl2) {
        boolean ergebnis = false;
        if (zahl1 > zahl2)
            ergebnis = true;
        return ergebnis;
    }
}
