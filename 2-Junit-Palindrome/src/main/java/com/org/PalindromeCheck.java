package com.org;

public class PalindromeCheck {

	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		char[] a = s.toCharArray();
		int i=0,j=a.length-1;
		
		while(i<=j) {
			if(a[i] != a[j]) return false;
			i++;
			j--;
		}
		return true;
	}

}
