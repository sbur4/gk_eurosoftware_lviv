public class Test12 {
    public static void main(String[] args) {
        String s1 = "hello";
        final String s2 = "hel";
        String s3 = "lo";
        System.out.println(s1 == s2 + s3);
        System.out.println(s1.equals(s2 + "lo"));
    }
}

// false true