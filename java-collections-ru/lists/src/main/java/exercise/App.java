package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;



// BEGIN
class App{
	public static void main(String[] args) {
		System.out.println(scrable("hello", "hello"));
		
	}
	
	public static boolean scrable(String symbols, String word) {
		int length = word.length();
		String[] letters = symbols.split("");
		List list = new ArrayList(Arrays.asList(letters));
		
		for(var i = 0; i < length; i++) {
			String currentSymbol = word.substring(i, i + 1).toLowerCase();
			
			if(!list.contains(currentSymbol)) {
				return false;
			}else {
				list.remove(currentSymbol);
			}
			
		}
		return true;
		
	}
}

//END
