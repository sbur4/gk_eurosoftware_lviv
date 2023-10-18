public class Test8 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            bedMethod();
        } catch (Exception e) {
            System.out.println("B");
        } catch (Throwable ex) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }
        System.out.println("E");
    }

    private static void bedMethod() {
        throw new Error();
    }
}

// ACDE