package Projects;

import java.util.Calendar;

public class Clock {
    public static void main(String[] args) {
        Calendar T = Calendar.getInstance();
        int Hour = T.get(Calendar.HOUR);
        int Sec = T.get(Calendar.SECOND);
        int Min = T.get(Calendar.MINUTE);

        System.out.println("Now Time  " + Hour + ":" + Min + ":" + Sec);
    }

}
/* Zaman Alan */