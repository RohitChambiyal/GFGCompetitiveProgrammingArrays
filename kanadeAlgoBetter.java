
//to find maximum increasing sequence sum
import java.util.Scanner;

public class kanadeAlgoBetter {
    public  static void findMaxContSum(int[] arr, int n) {
    int c_sum =0;
    int max_sum = 0;
    int min_sum =Integer.MIN_VALUE;
    boolean check = false;
    for(int i=0;i<n;i++){
        if(arr[i]>0){
            check =true;
            c_sum+=arr[i];
            max_sum = Math.max(c_sum, max_sum);
        }
        else{
            if(arr[i]>min_sum)
                min_sum = arr[i];
            if(c_sum+arr[i]>0){
                c_sum+=arr[i];
            }
            else{
                c_sum = 0;
            }
        }
    }
    if(check==true)
        System.out.println(max_sum);
    else
        System.out.println(min_sum);
    }
    public static void main(String[] arg){
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