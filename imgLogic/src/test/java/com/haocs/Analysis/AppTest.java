package com.haocs.Analysis;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static void main(String[] args) {
		
				check("haocs","haochengshuai");	
	}	
			public static String check(String s, String t) {
		        int j = 0;
		        for (int i = 0; i < s.length() && j < t.length(); i++) {
		            if(t.charAt(j) == s.charAt(i)) j++;
		        }
		        return (j == t.length()) ? "Yep, it's wood." : "Nope.";
	}
}
