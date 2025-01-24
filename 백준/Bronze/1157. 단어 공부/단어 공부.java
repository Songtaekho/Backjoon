import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> word = new HashMap<>();
		
		String S = scan.next().toUpperCase();
	
		String str = "";
		
		for(int i = 0; i < S.length(); i++) {
			str = "";
			str += S.charAt(i);
			
				if(word.containsKey(str)) {
					Integer value = word.get(str);
					value += 1;
					word.put(str, value);
				} else {
					word.put(str, 1);
				}
		}
		
		int max = 0;
		int cnt = 0;
		String name = "";
		
		Set<Entry<String, Integer>> entrySet = word.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(max < entry.getValue()) {
				max = entry.getValue();
				name = entry.getKey();
			} else if (max == entry.getValue()) {
				name = "?";
			}
		}
		System.out.println(name);

	}
}
