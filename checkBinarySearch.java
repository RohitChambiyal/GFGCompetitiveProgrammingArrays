import java.util.Arrays;

public class checkBinarySearch {
    public static void main(String[] args){
        int x[]= {1,2,3,4,5};
        int y[] = {1,2,14,16};
        int v =Arrays.binarySearch(y,15);
        System.out.println(v);
    }
}