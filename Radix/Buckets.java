import java.util.*;
import java.lang.Math;

public class Buckets{
	private static List<String> zeroBucket;
	private static List<String> oneBucket;

	public Buckets(){
		zeroBucket = new ArrayList<>();
		oneBucket = new ArrayList<>();
	}

	public static void addZero(String newValue){
		zeroBucket.add(newValue);
	}

	public static void addOne(String newValue){
		oneBucket.add(newValue);
	}

	public static List<String> getAllInOrder(){
		List<String> result = new ArrayList<>();

		for(String val: oneBucket){
			result.add(val);
		}

		for(String val: zeroBucket){
			result.add(val);
		}

		return result;
	}

}