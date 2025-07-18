package Queue;

public class CustomQueue {

    protected  final int MAX_SIZE = 5;
    protected int[] queue;
    int ptr=0;

    public CustomQueue() {
        queue=new int[MAX_SIZE];
    }
    public CustomQueue(int n) {
        queue=new int[n];
    }
    public void enQueue(int value) {
        if(queue.length==ptr) {
            System.out.println("Queue is full");
            return;
        }
        queue[ptr]=value;
                ptr++;
    }
    public int  remove() {
       if(ptr==0)
       {
              System.out.println("Queue is empty");
              return -1;
       }
         int value=queue[0];
         for(int i=0;i<ptr-1;i++) {
              queue[i]=queue[i+1];
    }
            ptr--;
            return value;
        }
}
