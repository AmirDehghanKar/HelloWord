package Projects;

import java.util.Timer;
import java.util.TimerTask;

public class TrafficLight {
	public static void main(String[] args) {
		Timer T = new Timer();
		TimerTask t = new TimerTask() {
			int c = 0;

			public void run() {
				System.out.println("Time: " + c++);
				if (c == 1) {
					System.out.println(" Green ");
				}
				if (c == 10) {
					System.out.println(" Yellow ");
				}
				if (c == 15) {
					System.out.println(" Red ");
				}
			}
		};
		T.schedule(t, 0, 1000);
	}
}
/* TrafficLight Hamrah Ba Timer */
