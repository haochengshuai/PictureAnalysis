package com.haocs.Analysis;

public class Test {
	public static void main(String[] args) {
		
		String check = check("haocs","haochengshuai");
		System.out.println(check);
		long time = getTime(100000l);
		System.out.println(time);
}	
	public static String check(String s, String t) {
        int j = 0;
        for (int i = 0; i < s.length() && j < t.length(); i++) {
            if(t.charAt(j) == s.charAt(i)) j++;
        }
        System.out.println(j);
        return (j == t.length()) ? "Yep, it's wood." : "Nope.";
}	
	public static long getTime(long d) {
        long upper = (long) Math.sqrt(d);
        for (long i = upper; i >= 0; i--) { 
            if(i + i*i <= d) return i;
        }
        return 0;
	}
}
