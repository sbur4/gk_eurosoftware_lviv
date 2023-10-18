class SuperClass {
    public void call() {
        System.out.println("superClass");
    }

    public void callParent() {
        super.hashCode();
    }
}

class SubClass extends SuperClass {
    @Override
    public void call() {
        System.out.println("subClass");
    }

    @Override
    public void callParent() {
        super.call();
    }
}

public class Test13 {
    public static void main(String[] args) {
        SuperClass sup = new SuperClass();
        sup.call();
        sup.callParent();

        SuperClass sub = new SubClass();
        sub.call();
        sub.callParent();
    }
}

// superClass subClass superClass