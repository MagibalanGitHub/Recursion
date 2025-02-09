import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();

        int rev=(reverse(a,0));
        System.out.println(rev);
    }
    public static int reverse(int b,int ans){
        if( b==0){
            return ans;
        }
        System.out.println(b);
        return reverse(b/10,ans*10+b%10);
    }
}
