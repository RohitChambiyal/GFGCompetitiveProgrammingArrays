import java.util.*;
import java.lang.*;
import java.io.*;


public class pythagoreanTriplet1{
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n = s.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		        arr[i] = s.nextInt();
            Arrays.sort(arr);
            System.out.println("\n");
            for( int x:arr){
                System.out.print(x+" ");
            }
		    int i=0;
		    int j=1;
		    boolean check = false;
            int end =n-1;
            System.out.println();
		    while(j<n-1&&i<n-2){
                System.out.println(arr[i]+" "+arr[j]+" "+ arr[end]);
                
		        if(arr[i]*arr[i] + arr[j]*arr[j] >arr[end]*arr[end]){
                    j++;
                    end = n-1;
                }
		        else if(arr[i]*arr[i] + arr[j]*arr[j] <arr[end]*arr[end]) 
		            end--;
		        else{
		            check = true;
		            break;
		        }
		        if(j==n-1&&i!=n-2){
                    System.out.println("called");
                    i++;
                    j=i+1;
                    end  = n-1;
		        }
            }
            if(check==true)
                System.out.println("Good");
            else
                System.out.println("false");
		}
	}
}