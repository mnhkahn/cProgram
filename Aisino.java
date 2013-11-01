class Aisino {
	public static void main(String args[]) {
		// 1.
		float f = 3.4f;
		
		// 2.
		int x = 13;
		x%=x/2;
		System.out.println("2. x=" + x);
		
		// 3.
		int a = 10, b = 3, m = 5;
		if (a == b) {
			m += a;
		}
		else
			m = ++a*m;
		System.out.println("3. m=" + m);
		
		// 4.
		int i = 10, j = 18, k = 30;
		switch(j - i) {
		case 8: System.out.println(++k);
		case 9: System.out.println(k+=3);
		case 10: System.out.println(k<<=1);
		default: System.out.println(k/=j);
		}
		System.out.println("4. k=" + k);
		
		// 5.
		int [] a5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("5. " + a5[9]);
		
		// 6.
		String str_1 = "ABC";
		String str_2 = new String("ABC");
		String str_3 = new String("ABC");
		boolean b1 = str_1.equals(str_2), b2 = str_2 == str_3, b3;
		b3 = !b1 ? b1 : b2;
		System.out.println("6. b3=" + b3);
		
		// 7.
		//下面三个对象一产生即成为拉圾  
        Person p1 = new Aisino().new Person();  
        Person p2 = new Aisino().new Person();  
        Person p3 = new Aisino().new Person();  
          
        //如果不加上下面这句，以上产生的三个对象虽成为拉圾,但不一定马上就会启用拉圾回收机制把拉圾回收走  
        //所以就可能看不到 finalize 方法内部执行的效果  
        System.gc();
        
        // 16.
        for (i = 0; i < 3; i++) {
        	switch(i) {
        	case 0: break;
        	case 1: System.out.print("one ");
        	case 2: System.out.print("two ");
        	case 3: System.out.print("three ");
        	}
        }
        System.out.println("done");
        
        // 18. A
/*        int i = 0;
        if (i) {
			System.out.println("OK");
		}*/
        
        // 18. B
/*        boolean b = true;
        boolean b2 = true;
        while (b <> b2) {
			System.out.println("OK");
		}*/
        
        // 18. C
        i = 1;
        j = 2;
        if (i == 1 || j == 2) {
			System.out.println("OK");
		}
        
        // 19
        int a1 = 2;
        int a2 = 2;
        b = (++a1) * 2 - (a2--) * 3;
        int c = (a1--) * 3 + (++a2) * 2;
        System.out.println("19. b=" + b + " c=" + c);
        
        // 8.
        i = 0;
        for (; i < 4; i += 2) {
        	System.out.print(i + " ");
        }
        System.out.println(i);
	}
	
	public class Person {  
	      
	    private String name;  
	    private int age;  
	      
	    public Person() {
	    	System.out.println("创建对象");
	    }  
	    public Person(String name) {  
	        this.name = name;     
	    }  
	    public Person(String name,int age) {  
	        this(name);    
	        this.age = age;  
	    }  
	      
	    //每个类里面都有finalize方法，和构造方法功能相反，一个是对象产生时调用，一个是对象消亡时调用  
	    public void finalize() {  
	          
	        System.out.println("开始清理对象...");  
	    }
	}
	
}