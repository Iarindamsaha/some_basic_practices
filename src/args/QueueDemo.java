package args;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Collections.addAll(queue,"Arindam","Saha","Hello","world");
        System.out.println(queue.peek());
        System.out.println(queue);
        long verbs = queue.stream().filter(i->i.contains("l")).count();
        System.out.println(verbs);
    }
}
