package com.file.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\SK\\Desktop\\Files\\doc3.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\SK\\Desktop\\Files\\doc1.txt")); 
		BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\SK\\Desktop\\Files\\doc2.txt")); 
		PrintWriter pw = new PrintWriter("C:\\Users\\SK\\Desktop\\Files\\doc3.txt"); 
		  String st1="";
		  String st2="";
		  st1 = br1.readLine();
		  st2 = br2.readLine();
		  try {
			while (st1 !=null || st2!=null ) {
				if(st1 != null) 
	            { 
					pw.print(st1+"\n");
	               System.out.println(st1);
	                st1 = br1.readLine(); 
	            } 
	              
	            if(st2 != null) 
	            { 
	            	pw.print(st2+"\n");
	            	 System.out.println(st2);
	                st2 = br2.readLine(); 
	            }
			}
			 pw.flush(); 
			
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
