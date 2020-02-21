/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class LargestNumberMySol {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n = s.nextInt();
		    String str[] = new String[n];
		    for(int i=0;i<n;i++){
		        str[i] = s.next();
		    }
		    for(int i=0;i<n-1;i++){
		        for(int j= i+1;j>0;j--){
		            String temp2 = str[j]+str[j-1];
		            String temp = str[j-1]+str[j];
		            //System.out.println("Matching "+temp+" and "+temp2+" gives "+temp.compareTo(temp2));
		            if(temp.compareTo(temp2)>=0){
		                j=1;
		            }
		            else{
		               // System.out.println("Before "+str[j-1] + str[j]);
		                String pending = str[j];
		                str[j] = str[j-1];
		                str[j-1] = pending;
		             //   System.out.println("After "+str[j-1] + str[j]);
		            }
		        }
		    }
		    for(int i=0;i<n;i++){
		        System.out.print(str[i]);
		    }
		    System.out.println("");
		    
		    
		    
		    
		}
	}
}