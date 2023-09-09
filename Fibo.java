import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibo {
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        int n = 1;
        // Math.random();
        // System.out.println(
        //         n + "th Fibonacci Number: " + fib(n));
                
        List<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        System.out.println(a.getClass().getName());
        System.out.println(Arrays.asList("a", "b").getClass().getName());
        a.add("C");
        System.out.println(a.getClass().getName());

        for (String string : a) {
            System.out.println(string);
        }
    }
}