public class Test4 {
    public static void main(String[] args) {
        System.out.println(sum1("75", "25"));
        System.out.println(sum2("75", "25"));
    }

    private static int sum1(String s1, String s2) {
        return Integer.parseInt(s1 + s2);
    }

    private static String sum2(String s1, String s2) {
        return Integer.valueOf(s1 + s2).toString();
    }
}

// 7525 7525