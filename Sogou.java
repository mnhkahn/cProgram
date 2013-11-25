import java.io.*;
public class Sogou{
	public static void main(String args[]) {
		// 2
		try {
			FileOutputStream fos = new FileOutputStream("afile.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(3);
			dos.writeChar(1);
			dos.close();
		} catch(IOException e) {}


		// 4
		B newB = new B();

		// 5
		String s = "hello world";
		String s1 = "Hello world";
		s.replace("hello", "Hello");
		System.out.println((s == s1) + "," + s.equals(s1));

		// 10
		Test.test(3);
		Test.test(0);
		System.out.println(Test.output);
		
		// 11
		StringBuilder str = new StringBuilder("ËÑ¹·Sogou");
		System.out.println(str.length());
		System.out.println(str.capacity());
		System.out.println(str.indexOf("S"));
		System.out.println(str.charAt(6));
	}
}
class Test{
	public static String output="";
	public static void test(int i) {
		try {
			if (i == 0) {
				throw new Exception();
			}
			output += "a";
		} catch (Exception e) {
			output += "b";
			return ;
		} finally {
			output += "c";
		}
		output += "d";
	}
}
class A {
	A() {}
} 
class B extends A {
	B() {
		super();
	}
}