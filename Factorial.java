public class Factorial {
    public static int m1(int a) {
        if(a==0){
            return 1;
        }
        if (a == 1) {
            return a;
        }
        return a*m1(a-1);
    }
    public static void main(String[]args){
        System.out.println(m1(15));
    }
}







