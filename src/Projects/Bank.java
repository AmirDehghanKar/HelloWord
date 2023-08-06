package Projects;

import java.util.Scanner;

class Bank {
    public static void main(String[] args) {
        Scanner V1 = new Scanner(System.in);
        System.out.println("Mablq Vam: ");
        int Vam = V1.nextInt();

        Scanner V2 = new Scanner(System.in);
        System.out.println("Meqdar Bahre Vam: ");
        int Bahre = V2.nextInt();

        Scanner V3 = new Scanner(System.in);
        System.out.println("Chand Sale: ");
        int Zaman = V3.nextInt();

        float Sood;
        Sood = (Vam * Bahre * (12 + 1)) / 2400;

        System.out.println("Meqdar Vam: " + Vam);
        System.out.println("Meqdar Sood: " + Sood);
        System.out.println("Meqdar Pardakhti: " + (Sood + Vam) / 12);
    }
}
/*
 * Meqdar V Bahre V Modat Zaman Pardakhte Vam Ra Vared Mikonim Sepas
 * Sood V Aqsati K Bayad Pardakht Shavad Ra Namayesh Midahad
 */
