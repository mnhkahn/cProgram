public class Test8 {
    public void myMethod(Object o) {
        System.out.println("My Object");
    }
    public void myMethod(String s) {
        System.out.println("My String");
    }
    public static void main(String args[]) {
        Test8 t = new Test8();
        t.myMethod(null);
    }
}
