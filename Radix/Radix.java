import java.util.*;

public class Radix{
	public static void main(String[] args){
		String[] origNumbers = {"0011", "1001", "1000", "0111", "0101"};
		List<String> numbers = new ArrayList<>();
		for(String num:origNumbers){
			numbers.add(num);
		}
		int numDigits = 4;
		// int b = numbers.size();
		sort(numbers, numDigits);
		System.out.println(numbers);
	}
	public static void sort(List<String> numbers, int b){
		int keys = 1;
		for(int i = 0; i< b; i++){
			keys *= 10;
		}
		int n = numbers.size();
		int counter =0;
		while(keys > 1){
			System.out.println(numbers);
			Buckets buck = new Buckets();
			for(int i = 0; i < n; i++){
				if(numbers.get(i).charAt(counter) == '0'){
					buck.addZero(numbers.get(i));
				}
				else{
					buck.addOne(numbers.get(i));
				}
			}
			numbers = buck.getAllInOrder();
			counter++;
			keys /=10;
		}
	} 
}