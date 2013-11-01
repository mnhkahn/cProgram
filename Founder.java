import org.omg.CORBA.PRIVATE_MEMBER;

class Founder {
	private int $abc = 20;
	private String Œ“ = "I";
	public static void main(String argv[]) {
		// 1.
//		boolean flag = null;
		double f = 0.92395917;
//		long a = 9223372036854775808L;
		System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		
		// 5.
		int x = 0;
		int i = 1;
		do {
			if ((i % 5) == 0) {
				i++;
				continue;
			}
			x += ++i;
		} while (x < 100);
		System.out.println("x=" + x);
		
		// 6.
		Child child = new Founder().new Child(50, 50);
//		Parent child = new Founder().new Child(50, 50);
		child.increaseX(100);
		child.increaseY(100);
		System.out.println("x=" + child.x + " and y=" + child.y);
		Parent parent = (Parent)child;
		System.out.println("Parent x=" + parent.x + " and y=" + parent.y);
		
		// 8.
		StaticTest obj1 = new StaticTest(5);
		obj1.increaseX(2);
		StaticTest obj2 = new StaticTest(3);
		obj2.x += 4;
		StaticTest obj3 = new StaticTest(1);
		StaticTest.x += 3;
		System.out.println("x=" + obj1.x);
		
		// 3.
		StringBuilder word = new StringBuilder("Hello");
		getWho(word);
		System.out.println(word.toString());
	}
	
	public class Parent{
		public int x;
		public int y;
		public Parent(int x, int y) {
			this.x = x;
			this.y = y;
			System.out.println("parent: " + this.x + " " + this.y);
		}
		public void increaseX(int x) {
			this.x = getX() + x;
		}
		public int getX() {
			return x;
		}
		public void increaseY(int y) {
			this.y = getY() + y;
		}
		public int getY() {
			return y;
		}
	}
	
	public class Child extends Parent {
		private int x;
		private int y;
		public Child(int x, int y) {
			super(x, y);
			this.y = y + 250;
			this.x = x + 150;
			System.out.println(this.x + " " + this.y);
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
	}
	
	class A {
		protected int method(int a, int b) {
			return 0;
		}
	}
	class B extends A {
//		public int method(int a, int b) {
//			return 0;
//		}
//		private int method(int a, int b) {
//			return 0;
//		}
//		private int method(int a, short b) {
//			return a + b;
//		}
//		public short method(int a, int b) {
//			return a + b;
//		}
	}
	
	public static void getWho(StringBuilder word) {
		word = word.append(" word");
	}
	
}
class StaticTest {
	public static int x = 1;
	public void increaseX(int increasement) {
		x += increasement;
	}
	public StaticTest(int original) {
		increaseX(original);
		if (x > 10) {
			x = 1;
		}
	}
}
interface BinaraySearchTree<T> {
	void add(T value);
	void remove();
	T find(T value);
	int size();
}
interface Comparable<T> {
	public int compareTo(T o1, T o2);
}
class BinSearchTree<T> implements BinaraySearchTree<T> {
	public BinSearchTree(Comparable<T> compare) {
		
	}
	public void add(T value) {
		
	}
	public void remove() {
		
	}
	public T find(T value) {
		return null;
	}
	public int size() {
		return 0;
	}
	
}