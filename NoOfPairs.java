/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class NoOfPairs {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n1 = s.nextInt();
		    int n2 = s.nextInt();
		    int arr1[] = new int[n1];
		    int arr2[] = new int[n2];
		    for(int i=0;i<n1;i++)
		        arr1[i] = s.nextInt();
		    for(int i=0;i<n2;i++)
		        arr2[i]= s.nextInt();
		        
		        int count=0;
		    for(int i=0;i<n1;i++){
		        for(int j=0;j<n2;j++){
		            if(Math.pow(arr1[i],arr2[j])>Math.pow(arr2[j],arr1[i])){
		                count++;
		            }
		        }
		    }
		    System.out.println(count);
		    
		}
	}
}