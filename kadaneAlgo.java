import java.util.Arrays;
import java.util.Scanner;

public class kadaneAlgo {
    public static void findMaxContSum(int [] arr,int n){
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i])
                max=arr[i];
            if(arr[i-1]>0)
            arr[i] += arr[i-1];
            if(max<arr[i])
                max = arr[i];
            
        }
        System.out.println(max);
        
        
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t--!=0){
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        findMaxContSum(arr,n);
    }
        
    }
}