import java.util.Arrays;
import java.util.Scanner;
  


public class noOfPairBetter {

    public static int countfun(int x, int[] arr2, int n2, int[] nY) {
        if(x==0) return 0;
        if(x==1) return nY[0];
        int index = Arrays.binarySearch(arr2, x);
        System.out.println("out index"+index);
        int sum;
        if(index<0){
            System.out.println("index"+index);
            index = Math.abs(index+1);
            System.out.println(index);
            sum = arr2.length-index;
        }
        else{
            while(index<arr2.length&&arr2[index]==x){
                index++;
            }
            sum =arr2.length - index;
        }
        sum += nY[0]+ nY[1];
        if(x==2) sum -= (nY[3]+nY[4]);
        if(x==3) sum += nY[2];
        return sum;

        
        
    }

    public static int findPairs(int[] arr1, int []arr2,int n1,int n2){
        int NY[] = new int[5];
        for(int i=0;i<n2;i++){
            if(arr2[i]<5){
                NY[arr2[i]]++;
            }
        }
        Arrays.sort(arr2);
        int count =0;
        for(int i=0;i<n1;i++){
            count+=countfun(arr1[i],arr2,n2,NY);
        }
        return count;
    }
  

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t--!=0){
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            int arr1[] = new int[n1];
            int arr2[] = new int[n2];
            for(int i=0;i<n1;i++){
                arr1[i] = s.nextInt();
            }
            for(int i=0;i<n2;i++){
                arr2[i] = s.nextInt();
            }
            System.out.println(findPairs(arr1,arr2,n1,n2));
        }
    }
}