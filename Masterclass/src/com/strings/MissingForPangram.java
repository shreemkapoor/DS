package com.strings;

public class MissingForPangram {

	static String checkPangram(String pangram) {
		int[] ascii= new int[128];
		char[] chars= pangram.toLowerCase().toCharArray();
		
		for(int i=0;i<chars.length;i++) {
			int test= chars[i];
			if(test<128) {
				ascii[test]+=1;
			}
		}
		//System.out.println(Arrays.toString(ascii));
		 String res = ""; 
		for(int i=97;i<=122;i++) {
			if(ascii[i]==0) {
				//System.out.println("String is not a pangram"+i);
				String s = Character.toString((char)i);
				//System.out.println(s);
				res+=s;
			}
		}
		System.out.print("String is not a pangram and missing characters are: ");
		System.out.print(res);
		return res;
		
	}
	
	public static void main(String[] args) {

		checkPangram("The quick rown fox umps over the lazy dog");
		
	}

}
