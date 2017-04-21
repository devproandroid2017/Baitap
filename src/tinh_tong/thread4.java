package tinh_tong;

import java.util.Calendar;

public class thread4 {
	public final static float MAX = 1000000000;
	public final static float MIN = 850000000;
	public static float S = 0 ;
	private void thread4(final float MAX) {
		for (float i = MIN ; i <= MAX ; i++){
			S = S + i ;	
		}
		System.out.println(S);
	};
	public void run() {long begin = Calendar.getInstance().getTimeInMillis(); 
	thread4(MAX);
	long end = Calendar.getInstance().getTimeInMillis(); 
	System.out.println("Executed Time: " + (end - begin)); 
		
	}

}
