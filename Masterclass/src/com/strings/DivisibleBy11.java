package com.strings;

public class DivisibleBy11 {

	public static void main(String[] args) {
		
		int oddsum=0;
		int evensum=0;
		String str="76945";
		int n=str.length();
		if(n==0) {
			System.out.println("Empty String");
			return;
		}
		
		/*
		 * if(n==1) { System.out.println("String too small"); }
		 */
		else {
			for(int i=0;i<n;i++) {
				if(i%2==0) {
					oddsum+=(str.charAt(i)-'0');
				}
				else {
					evensum+=(str.charAt(i)-'0');
				}
			}
			boolean divisible= ((evensum-oddsum)%11==0);
			/* oddsum-evensum */
			if(divisible) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		
	}

}
