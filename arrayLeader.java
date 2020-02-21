/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class arrayLeader {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n = s.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i]= s.nextInt();
		    int max = arr[n-1];
		    int sol[] = arr;
		    
		    for(int i=n-2;i>=0;i--){
		        if(arr[i]>=max){
		            max = arr[i];
		        }
		        else{
		         
		            sol[i]=Integer.MIN_VALUE;
		        }
		    }
		    for(int i=0;i<n;i++){
		        if(sol[i]!=Integer.MIN_VALUE){
		            System.out.print(sol[i]+" " );
		        }
		    }
		    System.out.println();
		    
		    
		}
	}
}