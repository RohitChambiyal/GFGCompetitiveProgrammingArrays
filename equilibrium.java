/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
// 1 3 5 2 2 
// 1 4 9 11 13
// 13 12 9 4 2
class equilibrium {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
            int n = s.nextInt();
            if(n==1){
                s.nextInt();
                System.out.println("1");
                continue;
            }
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i] = s.nextInt();
		    int [] psa1 = new int[n];
		    int[] rpsa = new int[n];
		    psa1[0] = arr[0];
		    for(int i=1;i<n;i++){
                psa1[i] = psa1[i-1] + arr[i];
            //System.out.println("p"+psa1[i]);
            }
            rpsa[n-1] = arr[n-1];
		    for(int i=n-2;i>-1;i--){
                rpsa[i] = rpsa[i+1] + arr[i];
             //System.out.println(rpsa[i]);   
            }
            boolean check = false;
		    for(int i=0;i<n;i++){
		        if(psa1[i]==rpsa[i])
		        {
                    System.out.println(i+1);
                    check= true;
                    break;
		        }
            }
            if(check==false){
                System.out.println("-1");
            }
		}
	}}