import java.util.ArrayList;
import java.util.List;

public class TutorHelp {

	public static void main(String[] args) {
		List<String> colorsList = new ArrayList<>();
		colorsList.add("red");
		colorsList.add("white");
		colorsList.add("blue");
		String colorOne = getFirst(colorsList);
		System.out.println(colorOne);
		
		String colorTwo = getMiddle(colorsList);
		System.out.println(colorTwo);
		
		String colorThree = getLast(colorsList);
		System.out.println(colorThree);
		
		//methods are always inside of a class, but outside of the main method
		
	}
	public static void sayHello( ) {
		System.out.println("Hello");
	}
	//takes in a list of strings and returns the first string
	public static String getFirst(List<String> list) {
		return list.get(0);
	}	
		public static String getMiddle(List<String> list) {
			return list.get(1);
}
	public static String getLast(List<String> list) {
		return list.get(2);
	}
	
	
	
}