/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class kthSmallest {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n = s.nextInt();
		    PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		    for(int i=0;i<n;i++){
		        pq1.add(s.nextInt());
		    }
		    int find = s.nextInt();
		    for(int i=1;i<find;i++){
		        pq1.poll();
		    }
		    System.out.println(pq1.poll());
		}
	}
}