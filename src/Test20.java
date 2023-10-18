import java.util.Arrays;

public class Test20 {
    public static void main(String[] args) {
        int[] in = {3, 2, 8, 7, 9};
        System.out.println(Arrays.toString(sortDesc(in)));
    }

    private static int[] sortDesc(int[] in) {
        int tmp = 0;
        for (int i = 0; i < in.length; i++) {
            for (int j = i + 1; j < in.length; j++) {
                if (in[j] > in[i]) {
                    tmp = in[i];
                    in[i] = in[j];
                    in[j] = tmp;
                }
            }
        }
        return in;
    }
}

//  [9, 8, 7, 3, 2]