package args;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class DequeDemo {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Hello");
        deque.add("World");
        System.out.println(deque);
        Collections.addAll(deque,"Arindam","Saha");
        System.out.println(deque);
        System.out.println(deque.getLast());
        System.out.println(deque.getClass());
        System.out.println(deque.offerLast("Arrays"));
        System.out.println(deque);
        deque.addLast("LAst");
        System.out.println(deque);
    }
}
