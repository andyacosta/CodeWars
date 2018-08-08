package codewars.kyu6;

import java.util.Arrays;
import java.util.Comparator;

public class HighestScoringWord {

	public static String high(String s) {
	    return Arrays.stream(s.split("\\s+"))
	    		.max(Comparator.comparingInt(
	    				c -> c.chars()
	    				.map(i -> i - 96)
	    				.sum()))
	    		.get();
	}

}
