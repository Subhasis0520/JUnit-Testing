package com.org;

public class JavaUtils {

	public Integer stringToInt(String s) {
		
		if(s==null || s.trim().length()==0) {
			throw new IllegalArgumentException();
		}
		
		return Integer.parseInt(s);
	}
}
