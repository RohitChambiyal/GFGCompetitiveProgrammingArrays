/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class missNo {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n = s.nextInt();
		    int arr[] = new int[n];
		    boolean check = false;
		    for(int i=0;i<n-1;i++){
                arr[i]=s.nextInt();
            }
            Arrays.sort(arr);
            
		    for(int i=1;i<n;i++){
		       
		        if(i!=arr[i]){
		            System.out.println(i);
		            check = true;
		            break;
		        }
		    }
		    if(check ==false){
		            System.out.println(n);
		    }
		    
		}
	}
}