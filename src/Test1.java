import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        changeList(arr);
        System.out.println(arr);
    }

    private static void changeList(List<String> arr) {
        arr.add("c");
        arr.remove("b");
        arr.add("d");
        arr = null;
    }
}

// [a, c, d]