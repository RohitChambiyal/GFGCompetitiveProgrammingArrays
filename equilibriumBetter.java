import java.util.Scanner;

public class equilibriumBetter {
    public static int findval(int n,Scanner s){
        if(n==1){
                s.nextInt();
                return 1;
            }
		    int[] arr = new int[n];
		   int sum=0;
		   for(int i=0;i<n;i++){
		        arr[i] = s.nextInt();
		        sum+=arr[i];
		   }
		   
		   int lsum = 0;
		   for(int i=0;i<n;i++){
		       
		       sum-=arr[i];
		       if(lsum==sum){
		           return i+1;
		       }
		       lsum+=arr[i];
		   }
		   return -1;
		    
		
    }
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
            int n = s.nextInt();
            System.out.println(findval(n,s));
            
	}
}   
}