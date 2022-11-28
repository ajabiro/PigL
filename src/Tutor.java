import java.util.ArrayList;
import java.util.List;

public class Tutor {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList.add(4);
		numberList.add(7);
		numberList.add(23);
		numberList.add(15);
		numberList.add(22);
		numberList.add(8);
		numberList.add(2);
		
	int sum = 0;
		
		for (int i = 0; i < numberList.size(); i++)
			sum += numberList.get(i);
		System.out.println(sum);
	
		}
}
