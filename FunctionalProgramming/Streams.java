
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Streams
{
	public static void main(String[] args) {
	  List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		       System.out.println(IntStream.range(0, 10).boxed()
		       .collect(Collectors.toList()));
	}
}