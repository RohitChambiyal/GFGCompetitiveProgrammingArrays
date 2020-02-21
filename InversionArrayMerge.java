import java.util.Arrays;

public class InversionArrayMerge {
    static long count =0;
    public static void mergeSort(int[] arr, int i , int j){
        
        if(i<j){
            int mid = (i+j)/2;
            mergeSort(arr,i,mid);
            mergeSort(arr,mid+1,j);
            merging(arr,i,mid,j);
        }

    }
    
    private static void merging(int[] arr, int i, int mid, int j) {
        //size of arrays to be merged.
        int len1 = mid-i+1;
        int len2 = j-mid;
        //temp arrays
        int arr1 [] = new int[len1];
        int arr2[]= new int[len2];
        //copy data to temp arrays
        for(int a = 0;a<len1;a++){
            arr1[a] = arr[i+a];
        }
        
        for(int a = 0;a<len2;a++){
            arr2[a] = arr[mid+1+a];
        }
        int a =0,b=0;
        int k = i;
        while(a<len1&&b<len2){
            if(arr1[a]<=arr2[b]){
                arr[k] = arr1[a];
                a++;
            }
            else{
                count+=(mid+1)-(i+a);
                arr[k] = arr2[b];
                b++;
            }
            k++;
        }
        while(a<len1){
            arr[k] = arr1[a];
            a++;
            k++;
        }

        while(b<len2){
            arr[k] = arr2[b];
            b++;
            k++;
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5 };
        mergeSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("count"+count);

    }
}