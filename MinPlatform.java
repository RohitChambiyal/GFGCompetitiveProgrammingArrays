/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class MinPlatform {
	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t--!=0){
	        int n = s.nextInt();
	        int arrive[] = new int[n];
	        int dept[] = new int[n];
	        for(int i=0;i<n;i++){
	            arrive[i]= s.nextInt();
	        }
	        for(int i=0;i<n;i++){
	            dept[i]= s.nextInt();
	        }
	        Arrays.sort(arrive);
	        Arrays.sort(dept);
	        int platform = 0;
	        int max=0;
	        int i=0;
	        int j=0;
	        while(i<n&&j<n){
	            if(arrive[i]<=dept[j]){
	                i++;
	                platform++;
	            }
	            else{
	                j++;
	                platform--;
	            }
	            if(platform>max){
	                max = platform;
	            }
	        }
	        if(i<n){
	            platform += n-i-1;
	        }
            if(platform>max){
                max = platform;
	        }
	        System.out.println(max);
	    }
	    
	}
}