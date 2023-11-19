public class SchlechterCode {

    public static void main(String[] args) {
        if (pruefeBedingung(7, 12)) {
            System.out.println("Die Bedingung wurde erfüllt!");
        } else {
            System.out.println("Die Bedingung wurde nicht erfüllt!");
        }
    }

    public static boolean pruefeBedingung(int zahl1, int zahl2) {
   
        if (zahl1 > zahl2)
            return true;
        return false;
    }
}
