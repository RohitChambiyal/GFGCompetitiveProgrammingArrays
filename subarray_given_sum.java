/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class subarray_given_sum {
    public static int findMatch(int[] arr,int sum,int n){
        int newsum =0;
        
        int p=0;
        
        for(int i=0;i<n;){
            while(i<n&&newsum<sum){
                newsum+=arr[i];
                i++;
            }
            while(newsum>sum){
                newsum-=arr[p++];
            }
            if(sum==newsum){
                System.out.println( ++p+" "+ i);
                return 0;
            }
    }
    if(sum!=newsum){
        System.out.println("-1");
    }
    return 0;
    }

	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
	   int t = s.nextInt();
	   while(t--!=0){
	       int n = s.nextInt();
	       int sum = s.nextInt();
	       int arr[] = new int[n];
	       for(int i=0;i<n;i++){
	           arr[i] = s.nextInt();
	       }
	       findMatch(arr,sum,n);
	   }
	   
	    
	}
}