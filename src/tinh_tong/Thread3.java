package tinh_tong;

import java.util.Calendar;

public class Thread3 implements Runnable {
	public final static float MAX = 850000000;
	public final static float MIN = 700000000;
	public static float S = 0 ;
	private void thread3(final float MAX) {
		for (float i = MIN ; i < MAX ; i++){
			S = S + i ;	
		}
		System.out.println(S);
	};
	public void run() {long begin = Calendar.getInstance().getTimeInMillis(); 
	thread3(MAX);
	long end = Calendar.getInstance().getTimeInMillis(); 
	System.out.println("Executed Time: " + (end - begin)); 
		
	}

}
