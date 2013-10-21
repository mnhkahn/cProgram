public class CrazyCount {
	private static volatile int count = 0;
	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			new Thread(new Runnable() {
				public void run() {
					synchronized (this.getClass()) {
						count++;
					}
				}
			}).start();
		}
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
		System.out.println(count);
	}
}