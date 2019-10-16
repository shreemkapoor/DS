package com.test;

//Test.java 
class Test { 
//swap() doesn't swap i and j 
	
	static	Integer i;
	static	Integer j;
public static void swap(Integer u, Integer n) 
{ 
	Integer temp = new Integer(u); 
	i = n; 
	j = temp; 
} 
public static void main(String[] args) 
{ 
	  long startTime = System.currentTimeMillis();  
		/*      StringBuffer sb = new StringBuffer("Java");  
		      for (int i=0; i<1000000000; i++){  
		  sb.append("T");  
		      }  
		      System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  */
      startTime = System.currentTimeMillis();  
      StringBuilder sb2 = new StringBuilder("Java");  
      for (int i=0; i<500000000; i++){  
          sb2.append("T");  
      }  
      System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
} 
} 
