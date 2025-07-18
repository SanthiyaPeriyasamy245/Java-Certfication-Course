package Queue;

import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    queue.offer(6);
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());


    CustomQueue customQueue=new CustomQueue();
    customQueue.enQueue(1);
    customQueue.enQueue(2);
    customQueue.enQueue(3);
    customQueue.enQueue(4);
    customQueue.enQueue(5);
    System.out.println(customQueue.remove());
    System.out.println(customQueue.remove());
    customQueue.enQueue(6);
    System.out.println(customQueue.remove());
    System.out.println(customQueue.remove());
    System.out.println(customQueue.remove());
    System.out.println(customQueue.remove());


    }
// This will return 1
  // This will return 5

// This will return null since the queue is empty
}