public class trappingRain1{
    public static void main(String[] args){
        int arr[] = {8,8,2,4,5,5,1};
        int n = arr.length;
        int sum=0;
        
        for(int i=1;i<n-1;i++){
            int left = arr[i];
            for(int j=0;j<i;j++)
                left = Math.max(arr[j],left);
            int right = arr[i];
            for(int j=i+1;j<n;j++){
                right = Math.max(arr[j],right);
            }
            sum = sum + (Math.min(left,right) - arr[i]);
           
        }
        System.out.println(sum);
    }
}