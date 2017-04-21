package tinh_tong;

import java.util.Calendar;

public class Thread1 implements Runnable {
	public final static float MAX = 400000000;
	public static float S = 0 ;
	private void Thread1(final float MAX) {
		for (float i = 1 ; i < MAX ; i++){
			S = S + i ;	
		}
		System.out.println(S);
	};
	@Override
	public void run() {long begin = Calendar.getInstance().getTimeInMillis(); 
	Thread1(MAX);
	long end = Calendar.getInstance().getTimeInMillis(); 
	System.out.println("Executed Time: " + (end - begin)); 
		
	}
}
