public class Question1 {
	public static boolean isOdd(int i) {
		return i % 2 == 1;
	}
	public static void main(String[] args) {
		for (int i = -10/*Integer.MIN_VALUE*/; i <= 10/*Integer.MAX_VALUE*/; ++i) {
			boolean isOdd = isOdd(i);
			System.out.println(String.format("i=%d, isOdd = %b", i, isOdd));
		}
	}
}