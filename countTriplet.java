import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class countTriplet {
    public static void findtriplet(int []arr,int n){
        
        Arrays.sort(arr);
        int count=0;
        int k=0;
       /* for(int a:arr){
            System.out.print(a+" ");
        } */
        System.out.println();
            // 1 2 3 5
            // 0 1 2 3
        int j=n-1;
        boolean check = true;
        for(int i=n-1;i>=1;){
            if(check){
            j= i-1; 
            check = true;
        }
            //2 k=0

            //i = 
            
            if(k>=j){
                i--;
                j=i-1;
                k=0;
                continue;
            }

            //System.out.print(arr[i]+" "+ arr[j] +" "+ arr[k] +"\n");
            if(arr[i]==arr[j]+arr[k]){
                count++;
                j--;
                check = false;
                
            }
            else if(arr[i]>arr[j]+arr[k]){
                k++;
            }
            else if(arr[i]<arr[j]+arr[k]){
                j--;
                check = false;
            }
        }
        if(count!=0)
            System.out.println(count);
        else    
            System.out.println("-1");
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int testcases = s.nextInt();
        while(testcases--!=0){
            int n = s.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]  = s.nextInt();
            }
            findtriplet(arr,n);
        }
    }
}