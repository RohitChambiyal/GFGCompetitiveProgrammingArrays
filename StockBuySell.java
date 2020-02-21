/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class StockBuySell {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n = s.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i] = s.nextInt();
		    int i=0;
		    int min = 0;
		    boolean visited = false;
		    boolean check = false;
		    while(i<n-1){
		        if(arr[i]<arr[i+1])
		            min = i;
		        while(i<n-1&&arr[i]<arr[i+1]){
		            check = true;
		            visited = true;
		            i++;
		        }
		        if(check == true){
		            System.out.print("("+min+" "+i+") ");
		            check =false;
		        }
		        else{
		            i++;
		        }
		    }
		    
		    if(visited == false)
		        System.out.print("No Profit");
		    
		    System.out.println("");
		    
		}
	}
}