package com.sorting;

public class BubbleSort {

	void bubble(int arr[]) {
		boolean swapped = false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					swapped=true;
				}
			}
			//for optimizing code( If we already have sorted array inner loop will not swap)
			 if (swapped == false) 
	                break;
		}
	}
	
	void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }  
	
	
	public static void main(String[] args) {

		BubbleSort ob = new BubbleSort();
		 int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
	        ob.bubble(arr); 
	        System.out.println("Sorted array"); 
	        ob.printArray(arr); 
		
	}

}
