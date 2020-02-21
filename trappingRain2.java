public class trappingRain2{
    public static void main(String[] args){
        int arr[] = {8,8,2,4,5,5,1};
        int n = arr.length;
        int sum=0;
        int left[] = new int[n];
        int right[] = new int[n];
        int min =arr[0];
        for(int i=1;i<n-1;i++){
            left[i] = Math.max(arr[i],min);
            min = left[i];
        }
        min = arr[n-1];
        for(int i=n-2;i>=1;i--){
            right[i] = Math.max(arr[i],min);
            min = right[i];
        }
        for(int i=1;i<n-1;i++){
            sum = sum + (Math.min(left[i],right[i]) - arr[i]);
           
        }
        System.out.println(sum);
    }
}