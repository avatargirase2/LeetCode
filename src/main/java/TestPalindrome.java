import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestPalindrome {
	
	


	static boolean palindromeRearranging(String inputString) {

		List<String> result = printAllKLengthRec(inputString.toCharArray(), "", inputString.length(),
				inputString.length());

		for (String s : result) {
			if (isPalindrome(s)) {
				return true;
			}

		}

		return false;

	}

	static boolean isPalindrome(String word) {
		return new StringBuffer(word).reverse().toString().equals(word);

	}

	static List<String> myMNap = new ArrayList<String>();
	
	static List<String> printAllKLengthRec(char[] set, String prefix, int n, int k) {
		
		
		

		// Base case: k is 0,
		// print prefix
		if (k == 0) {
			myMNap.add(prefix);
			return myMNap;
		}

		// One by one add all characters
		// from set and recursively
		// call for k equals to k-1
		for (int i = 0; i < n; ++i) {

			// Next character of input added
			String newPrefix = prefix + set[i];

			// k is decreased, because
			// we have added a new character
			printAllKLengthRec(set, newPrefix, n, k - 1);
		}

		return myMNap;
	}


	
	public static void main(String[] args) {
		
		
		System.out.println(palindromeRearranging("aabb"));
	}
}
