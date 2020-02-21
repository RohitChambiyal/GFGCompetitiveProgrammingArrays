import java.util.Scanner;

public class sortzeroonetwo {
    
	public static void main (String[] args) {
        
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t--!=0){
		    int n1 = s.nextInt();
		    int mem[] = new int[3];
		    for(int i=0;i<n1;i++){
		        mem[s.nextInt()]+=1;   
            }
		    int arr[] = new int[n1];
            int i=0;
            int j=0;
		    while(mem[i]!=0){
		        arr[j] = 0;
                mem[i]--;
                j++;
            }
            i++;
		    while(mem[i]!=0){
		        arr[j] = 1;
                mem[i]--;
                j++;
            }
            i++;
		    while(mem[i]!=0){
		        arr[j]=2;
                mem[i]--;
                j++;
		    }
		    for(int x:arr){
		        System.out.print(x+" ");
		    }
		    System.out.println();
		}
	}
}