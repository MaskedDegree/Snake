package u10.Project;

public class FPS {
	public static final int FPS = 30;
	public static final int TARGET_TIME = 1000 / FPS;
	
	public static void gameLoop() {
		
		long start = System.nanoTime();

		// Do Stuff!
		//update();
	    //draw();
		//drawToScreen();
	
	    long elapsed = System.nanoTime() - start;
	
	    long waitMillis = TARGET_TIME - elapsed / 1000000;
	    if (waitMillis < 0)
	    	waitMillis = 5;
	
	    try {
	            Thread.sleep(waitMillis);
	    } catch (Exception e) {
	            e.printStackTrace();
	    }
	}
}