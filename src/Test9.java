class AA {
    public boolean exists() {
        System.out.println("A");
        return true;
    }
}

public class Test9 {
    public static void main(String[] args) {
        AA a = null;
        if (a == null || !a.exists()) {
            System.out.println("B");
        }

        a = new AA();
        if (a == null && !a.exists()) {
            System.out.println("C");
        }

        if (a.exists()) {
            System.out.println("D");
        }
    }
}

// BAD