import java.util.Date;

public class Test extends Exception {
	static int count = 0;
	int j;
	public static void main(String[] args) {
		System.out.println(args.length);
		
		System.out.println("$\u0000$");
	
		Test test = new Test();
		System.out.println(test.j);
		
		ch\u0061r \u0061 = '\u0061';
		System.out.println(a);
		
		int x = 4;
		int y = 5;
		y = x++;
		System.out.println(y);
		
		System.out.println(8 | 9 & 10 ^ 11);
		
		int n = 7;
		n <<= 3;
		n = n & n + 1 | n + 2 ^ n + 3;
		n >>= 2;
		System.out.println(n);
		System.out.println((56 & 56) + (1 | 56) + (2 ^ 56) + 3);
		
		System.out.println("abcd" instanceof Object);
		
		x = 5;
		y = 3;
		int z = x + (x++) + (++x) + y;
		System.out.println(z + "|" + x);
		
		x = 0;
		boolean b1, b2, b3, b4;
		b1 = b2 = b3 = b4 = true;
		x = (b1 | b2 & b3 ^ b4) ? x++ : --x;
		System.out.println(x);
		
		byte bt = (byte)1000L;
		System.out.println(bt);
		bt = 127;
		bt++;
		System.out.println(bt);
		
		Date myDate = new Date(0);
		System.out.println(myDate);
		
		int arr[][] = new int[4][4];
		int []arr1[] = new int[4][4];
		int arr2[][] = new int[4][];
		
		AA aa = new AA(5);
	
		while (true) {
			try{
				if(count++ == 0)
					throw new AnnoException();
				System.out.println("No exception");
			} catch(AnnoException e){
				System.out.println("AnnoException");
			} catch(Exception e){
				System.out.println("Exception");
			}finally{
				System.out.println("Finally");
				if(count == 2) break;
			}
		}

	}
}

class AnnoException extends Exception{}

class AA extends BB {
	private int radius = 1;
	public void draw() {
		System.out.println("A.draw(),radius=" + radius);
	}
	public AA(int radius) {
		this.radius = radius;
		System.out.println("A constructor");
	}
}

class BB {
	private int radius = 10;
	public void draw() {
		System.out.println("B.draw(),radius=" + radius);
	}
	public BB() {
		System.out.println("B constructor");
		draw();
	}
}