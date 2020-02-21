/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class lastIndex1 {
	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    s.nextLine();
	    while(t--!=0){
	        String str = s.nextLine();
	        char[] array = str.toCharArray();
	        int len = array.length;
	        boolean check = false;
	        for(int i=len-1;i>=0;i--){
	            if(array[i]==('1')){
	                check = true;
	                System.out.println(i);
	                break;
	        }
	    }
	    if(check ==false)
	        System.out.println(-1);
	}
    }
}