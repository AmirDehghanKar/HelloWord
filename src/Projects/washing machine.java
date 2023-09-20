package Projects2;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class Wm {
    public static void main(String[] args) {
        Scanner level = new Scanner(System.in);
        System.out.print("WaterLevel 30 between 70 : ");
        int WaterLevel = level.nextInt();
        int WaterLevel2, WaterLevel3;

        if (WaterLevel < 30 || WaterLevel > 70) {
            System.out.println("Error: 30 between 70!");
            System.out.print("WaterLevel 30 between 70 : ");
            WaterLevel2 = level.nextInt();

            if (WaterLevel2 < 30 || WaterLevel2 > 70) {
                System.out.println("Error: 30 between 70!");
                System.out.print("WaterLevel 30 between 70 : ");
                WaterLevel3 = level.nextInt();

                if (WaterLevel3 < 30 || WaterLevel3 > 70) {
                    System.out.println("Error: 30 between 70!");
                    System.out.print("WaterLevel 30 between 70 : ");
                    int WaterLevel4 = level.nextInt();
                }
            }
        }
        Scanner Ofn = new Scanner(System.in);
        System.out.println("Turn on the washing machine ? ");
        boolean Start = Ofn.hasNext();
        System.out.println("Condition: " + Start);

        Timer T = new Timer();
        TimerTask t = new TimerTask() {
            int c = 60;

            public void run() {
                System.out.println("Timer:" + c--);
                if (c == 0) {
                    T.cancel();
                    System.out.println("End");
                }
                if (c == 57) {
                    System.out.println("  Mix Water and Washing Powder  ");
                }
                if (c == 50) {
                    System.out.println("  Entry of Floor and Water Into the Tank  ");
                }
                if (c == 45) {
                    System.out.println("  Start Washing  ");
                }
                if (c == 35) {
                    System.out.println("  Quick Wash  ");
                }
                if (c == 15) {
                    System.out.println("  Drain the Floor  ");
                }
                if (c == 10) {
                    System.out.println("  Rinse  ");
                }
            }
        };
        T.schedule(t, 0, 1000);
    }

    @Override
    public String toString() {
        return "Wm []";
    }

}