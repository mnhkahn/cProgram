class B extends A {
    B() {
        super("B");
        System.out.print("B");
    }
    public static void main(String[] args) {
        new B();
    }
}
