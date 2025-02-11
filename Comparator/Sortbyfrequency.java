import java.util.*;

public class Sortbyfrequency implements Comparator<Map.Entry<Integer, Integer>> {
    @Override
    public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
        // First, compare by frequency (descending order)
        int frequencyComparison = Integer.compare(entry2.getValue(), entry1.getValue());
        
        // If frequencies are the same, compare by the numbers themselves (ascending order)
        if (frequencyComparison == 0) {
            return Integer.compare(entry1.getKey(), entry2.getKey());
        }
        
        return frequencyComparison;
    }

    public static void main(String[] args) {
        int[] arr = {1,3, 4, 5, 4, 3, 2, 1, 2, 4, 3, 2, 5};
        
        // Step 1: Count frequencies using a HashMap
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Step 2: Convert map entries to a list
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Step 3: Sort the list by frequency (high to low) and by number (low to high if frequencies are the same)
        Collections.sort(list, new Sortbyfrequency());

        // Step 4: Print sorted array based on frequency
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            // Add each element 'value' times (frequency)
            for (int i = 0; i < entry.getValue(); i++) {
                result.add(entry.getKey());
            }
        }

        // Output the result
        System.out.println(result);
    }
}
