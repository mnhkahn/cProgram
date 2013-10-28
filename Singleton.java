public class Singleton {
	private static volatile Singleton INSTANCE = null;

	public Singleton() {

	}

	public static Singleton getInstance() {
		if (INSTANCE == null) {
			synchronized (Singleton.class) {
				if (INSTANCE == null) {
					return new Singleton();
				}
			}
		}
		return INSTANCE;
	}
}