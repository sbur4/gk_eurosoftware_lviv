public class Test10 {
    public static void main(String[] args) {
        int[] in = {1, 2, 3};

        for (int i : in) {
            System.out.println(i);
            i += 5;
        }

        System.out.println();
        for (int i : in) {
            System.out.println(i);
        }
    }
}

// 123 123