public class calculateNumberOfDigits{
    public static void main(String[] args){
        int n = 70;
        System.out.println(Math.log10(n));
        int nlen = (int) Math.floor(Math.log10(n))+1;
        System.out.println(nlen);
    }
}