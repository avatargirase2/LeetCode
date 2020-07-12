package com.job.interviews;

/*Given a string, find the length of the longest substring without repeating characters.
 *Company : HCL/Nortan Security 
 * */

import java.util.HashSet;

public class LongestSubstring {
		
	public static String getLongestSubString(String string) {
		
		String result = null;
		int start_pointer=0;
		int end_pointer =0;
		int maxCounter = 0;
		HashSet<Character> visited = new HashSet<Character>();
		
		while(end_pointer < string.length()) {
			if(!visited.contains(string.charAt(end_pointer))) {
				visited.add(string.charAt(end_pointer));
				++end_pointer;
				if(maxCounter <= visited.size()) {
					maxCounter = visited.size();
					result = string.substring(start_pointer, end_pointer);
				}
			} else {
				visited.remove(string.charAt(start_pointer));
				++start_pointer;
			}
			
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		System.out.println(getLongestSubString("AVATAR"));
	}

}
