package com.arrays;

import java.io.*;

public class Notepad{
   public static void main(String[] args) 
   {
            try
            { 
            Process process = Runtime.getRuntime().exec("pwd"); // for Linux
            //Process process = Runtime.getRuntime().exec("cmd /c dir"); //for Windows

            process.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
               while ((line=reader.readLine())!=null)
               {
                System.out.println(line);   
                }
             }       
                catch(Exception e)
             { 
                 System.out.println(e); 
             }
             finally
             {
               //process.destroy();
             }  
    }
}