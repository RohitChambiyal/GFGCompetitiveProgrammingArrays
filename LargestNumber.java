/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class LargestNumber {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n = s.nextInt();
		    Vector<String> v1 = new Vector<String>();
		    while(n--!=0){
		        v1.add(s.next());
		    }
		    Collections.sort(v1,new Comparator<String>(){
		        public int compare(String x,String y){
                    
                    System.out.println("Vector "+v1);
                    String xy = x+y;
                    System.out.println("xy " + x+" "+y);
                    String yx = y+x;
                    System.out.println("yx " + y+" "+x);
                    System.out.println("Compare to "+ xy.compareTo(yx));
		            if(xy.compareTo(yx)>0)
		                return -1;
		            else
		                return 1;
		        }
            });
            System.out.println(v1);
		    Iterator itr1 = v1.iterator();
		    while(itr1.hasNext()){
		        System.out.print(itr1.next());
		    }
		    System.out.println();
		}
	}
}