//create an array with the values (1,2,3,4,5,6,7) and shuffle it.
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class MyArray2
{
	public static void main(String[] args) 
    {
		Integer[] a={1,2,3,4,5,6,7};
		List<Integer>li=Arrays.asList(a);
		Collections.shuffle(li);
		li.toArray(a);
		System.out.println(Arrays.toString(a));
	}
}