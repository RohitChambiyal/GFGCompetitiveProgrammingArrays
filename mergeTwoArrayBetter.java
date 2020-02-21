import java.util.Scanner;

//no extra space

/*
2
4 5
1 3 5 7
0 2 6 8 9
2 3
10 12
5 18 20
*/
public class mergeTwoArrayBetter{
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int t = s.nextInt();
       while(t-- != 0){
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i] = s.nextInt();
        };
        for(int i=0;i<n2;i++){
            arr2[i] = s.nextInt();
        }
        int i=0;int j=0;
        int mem[] = new int[n1+n2];
        for(int x=0;x<n1+n2;x++){
            if(i>=n1){
                mem[x] = arr2[j];
                //System.out.println(arr2[j]);
                j++;
            }
            else if(j>=n2){
                mem[x] = arr1[i];
                //System.out.println(arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                //System.out.println(arr2[j]);
                mem[x] = arr2[j];
                j++;
            }
            else{
                //System.out.println(arr1[i]);
                mem[x]= arr1[i];
                i++;
            }
       }
       System.out.println();
       for(int a:mem)
        System.out.print(a+" ");
    System.out.println();
    }

}
}