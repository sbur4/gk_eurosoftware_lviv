import java.util.Arrays;

public class Test18 {
    //    private static final int INITIAL_CAPACITY = 3;
//    private Object[] d = new Object[INITIAL_CAPACITY];
    private int maxSize;
    private Object[] stackArray;
    private int top;

    public Test18() {
    }

    public Test18(int max) {
        this.maxSize = max;
        stackArray = new Object[maxSize];
        top = -1;
    }

    public void push(Object e) {
        if (isFull(stackArray)) {
            stackArray = Arrays.copyOf(stackArray, maxSize + 1);
            stackArray[++top] = e;
        } else {
            stackArray[++top] = e;
        }
    }

    public Object pop() {
        if (isEmpty(stackArray)) {
            System.out.println(0);
            return 0;
        } else {
            return stackArray[top--];
        }
    }

    public boolean isFull(Object[] stackArray) {
        return (top == maxSize - 1);
    }

    public boolean isEmpty(Object[] stackArray) {
        return (top == -1);
    }

    public static void main(String[] args) {
        Test18 test = new Test18(3);
        System.out.println(Arrays.toString(test.stackArray));
        test.push("o1");
        test.push("o2");
        test.push("o3");
        System.out.println(Arrays.toString(test.stackArray));
        test.push("o4");
        System.out.println(Arrays.toString(test.stackArray));
        System.out.println(test.stackArray.length);
        test.pop();
        test.pop();
        test.pop();
        test.pop();
        test.pop();
    }
}