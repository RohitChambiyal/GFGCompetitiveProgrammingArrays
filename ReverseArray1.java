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
		    int x=0;
		    while(x<n){
		        int l = k-1;
		        for(int j=0;j<k/2;j++){
		            if(x+l>=n){
		                break;
		            }
		            int temp = arr[x+j];
		            arr[x+j] =arr[x+l];
		            arr[x+l]= temp;
		            l--;
		        }
		        x+=k;
		    }
		    int m = n%k;
		    int j=0;
		    int l = n-1;
		    // 0 1 2 3 4 
		    // 5     2      3 + 1 
		    for(int i=n-m;i<(n-m)+(m/2);i++){
		        
		        int temp = arr[i+j];
		            arr[i+j] =arr[l];
		            arr[l]= temp;
		            j++;
		            l--;
		    }
		
		    for(int i=0;i<n;i++){
		        System.out.print(arr[i]+" ");
		    }
            System.out.println();
            
		}
	}
}