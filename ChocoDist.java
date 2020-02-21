/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ChocoDist {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n = s.nextInt();
		    int A[] = new int[n];
		    for(int i=0;i<n;i++)
		        A[i] = s.nextInt();
		    int students = s.nextInt();
		    Arrays.sort(A);
		    int i = 0;
		    int j = students-1;
		    int min = Integer.MAX_VALUE;
		    while(j<n){
		        int temp = A[j]-A[i];
		        if(min > temp)
		            min = temp;
		          i++;
		          j++;
		    }
		    System.out.println(min);
		}
	}
}