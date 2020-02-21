
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n = s.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
                arr[i] = s.nextInt();
            for(int i=0;i<n;i++)
                arr[i] = arr[i] * arr[i];
            Arrays.sort(arr);
            
            
		    int i=0;
		    int j=1;
		    boolean check = false;
            int end =n-1;
            
		    while(j<n-1&&i<n-2){
                
                
		        if(arr[i] + arr[j] >arr[end]){
                    j++;
                    end = n-1;
                }
		        else if(arr[i] + arr[j] <arr[end]) 
		            end--;
		        else{
		            check = true;
		            break;
		        }
		        if(j==n-1&&i!=n-2){
                    
                    i++;
                    j=i+1;
                    end  = n-1;
		        }
            }
            if(check==true)
                System.out.println("Yes");
            else
                System.out.println("No");
		}}
}