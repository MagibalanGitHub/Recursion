public class basicRecursion {
    public static int m1(int a){
        if(a==0){
            return a;
        }

        int b=m1(a-1);
           System.out.print(a);
           System.out.print(b);
        return b;
    }
    public static void main(String[] args) {
        System.out.println(m1(5));
    }
}
