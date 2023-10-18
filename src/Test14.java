public class Test14 {
    public static void main(String[] args) {
        int[] in = {1, 2, 3};

        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
            in[i] += 5;
        }
        System.out.println();
        for (int i : in) {
            System.out.println(i);
        }
        System.out.println();
    }
}

// 123 678