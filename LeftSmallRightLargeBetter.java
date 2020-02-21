/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class LeftSmallRightLargeBetter{
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n = s.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i] = s.nextInt();
		    
		    
		    int right[] = new int[n];
		    int rmax = arr[n-1];
		    
		    for(int i=n-2;i>=0;i--){
		        right[i] = Math.min(arr[i+1],rmax);
		        rmax = right[i];
		    }
		    int left = arr[0];
		    boolean check = false;
		    for(int i=1;i<n-1;i++){
		        if(arr[i]>=left&&arr[i]<=right[i]){
		            System.out.println(arr[i]);
		            check = true;
		            break;
                }
                else 
                    left = Math.max(left, arr[i]);
		    }
		    if(check ==false){
		        System.out.println(-1);
		    }
		  
		}
	}
}