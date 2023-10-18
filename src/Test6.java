class A {
    public static void itStatic() {
        System.out.println("its A");
    }

    public void that() {
        System.out.println("that A");
    }
}

class B extends A {
    public static void itStatic() {
        System.out.println("its B");
    }

    @Override
    public void that() {
        System.out.println("that B");
    }
}

public class Test6 {
    public static void main(String[] args) {
        A a = new A();
        a.itStatic();
        a.that();

        A aa = new A();
        aa.itStatic();
        aa.that();

        B b = new B();
        b.itStatic();
        b.that();
    }
}

// its A that A its A that A its B that B