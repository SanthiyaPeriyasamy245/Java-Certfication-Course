package javapracitce;
import java.util.*;

class sortBasedOnLength implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        // Compare based on length of the strings
    	System.out.println(o1 +" "+o2);
        return Integer.compare(o2.length(), o1.length());
    }
}

public  class Queues {
    public static void main(String[] args) {
    	Queue<String>datas=new PriorityQueue<>();
    	datas.addAll(List.of("sad","dgdg","sdfrsg","dsgjfd","sfetrey"));
        Queue<String> data = new PriorityQueue<>(new sortBasedOnLength());
        data.addAll(List.of("siva", "sri", "santhiya", "saraswathy","gowtham"));

        
        System.out.println(datas);
        // Print the sorted list
        System.out.println(data);
    }
}
