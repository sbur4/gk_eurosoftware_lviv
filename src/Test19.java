import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test19 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(Arrays.asList("aaaaaaa", "bbbbbb", "ccccc", "d", "eeee", "g", "h", "hh"));
        removeElementWithLengthEquals1(arr);
        System.out.println(Arrays.toString(new ArrayList[]{arr}));
    }

    private static ArrayList<String> removeElementWithLengthEquals1(ArrayList<String> arr) {
        Iterator<String> it = arr.iterator();
        while (it.hasNext()) {
            Integer i = it.next().length();
            if (i == 1) {
                it.remove();
            }
        }
        return arr;
    }
}

// [[aaaaaaa, bbbbbb, ccccc, eeee, hh]]