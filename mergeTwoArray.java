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
public class mergeTwoArray{
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
        for(int x=0;x<n1;x++){
            //System.out.println(arr1[i]+ " " + arr2[j]);
            //System.out.println("1");
            if(arr1[i]>arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                
                i++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
                
            }
            else if(arr1[i]==arr2[j]){
                i++;
            }
            while((j<n2-1)&&arr2[j]>arr2[j+1]){
                //System.out.println("1");
                int temp = arr2[j];
                arr2[j] = arr2[j+1];
                arr2[j+1] = temp;
                j++;
            }
            j=0;
        }
        
        for(int l=0;l<n1;l++){
            System.out.print(arr1[l]+" ");
        };
        
        for(int l=0;l<n2;l++){
            System.out.print(arr2[l]+" " );
        }
        
        
        

       }
    }
}