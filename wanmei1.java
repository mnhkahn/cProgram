public class CrazyCount {
	private static volatile int count = 0;
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			new Thread(new Runnable() {
				public void run() {
					count++;
				}
			}).start();
		}
	}
}

public class Test {
	public static void main(String[] args) {
		int x = 5;
		boolean b1 = true;
		boolean b2 = false;
		if ((x == 4) && !b2)
			System.out.print("1");
		System.out.print("2");
		if ((b = true) && b1)
			System.out.print("3");
	}
}

public class Test {
	public void myMethod(Object o) {
		System.out.println("My Object");
	}
	public void myMethod(String s) {
		System.out.println("My String");
	}
	public static void main(String args[]) {
		Test t = new Test();
		t.myMethod(null);
	}
}

class C {
	C() {
		System.out.print("C");
	}
}
class A {
	C c = new C();
	A() {
		this("A");
		System.out.print("A");
	}
	A(String s) {
		System.out.print(s);
	}
}
class B extends A {
	B() {
		super("B");
		System.out.print("B");
	}
	public static void main(String[] args) {
		new B();
	}
}

a = 0; c = 1;
do {
	--c;
	a = a - 1;
} while (a > 0);

class Value {
	public int i = 15;
}
public class Test {
	public static void main(String argv[]) {
		Test t = new Test();
		t.first();
	}
	public void first() {
		int i = 5;
		Value v = new Value();
		v.i = 25;
		second(v, i);
		System.out.println(v.i);
	}
	public void second(Value v, int i) {
		i = 0;
		v.i = 20;
		Value val = new Value();
		v = val;
		System.out.println(v.i + " " + i);
	}
}