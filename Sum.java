import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        System.out.println("The Sum is : "+sum(a));
    }
    public static int sum(int a){
        if(a==0){
            return a;
        }
        return sum(a/10)+a%10;
    }
}
