/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n = s.nextInt();
		    int k = s.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i] = s.nextInt();
		    
		    for(int i=0;i<n;i=i+k){
		        int left = i;
		        int right = Math.min(i+k-1,n-1);
		        while(left<right){
		            int temp = arr[left];
		            arr[left] = arr[right];
		            arr[right] = temp;
		            left++;
		            right--;
		        }
		    }
            for(int i=0;i<n;i++){
		        System.out.print(arr[i]+" ");
		    }
		    System.out.println();
		}
	}
}