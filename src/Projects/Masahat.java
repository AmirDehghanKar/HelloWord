package Projects;

import java.util.Scanner;

public class Masahat {
    public static void main(String[] args) {
        final float P = 3.14f;
        Scanner input = new Scanner(System.in);
        System.out.println("Shoae Dayere Ra Vared Konid: ");
        int Shoa = input.nextInt();
        System.out.println("");

        System.out.println("Masahat Dayere Ra Be Dast Avarid");
        System.out.println("PI: " + Math.PI);
        System.out.println("Hasel=>Shoa * Shoa * Pi :" + (Shoa * Shoa) * P);
    }
}
/* Mohasebe Masahat Dayere Ba Daryaft Shoa Dayere Az Karbar */