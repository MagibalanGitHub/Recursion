public class FibonaccicSeries {
    public static int fib(int a){
        if(a<=1){
            return a;
        }

      //  System.out.println(a);
        return fib(a-1)+fib(a-2);
        /*
        n=0 --> fib(0) -->0
        n=1 --> fib(1) -->1
        n=2 --> fib(1) + fib(0) --> 1+0 =1
        n=3 --> fib(2) + fib(1) --> 1+1 =2
        n=4 --> fib(3) + fib(2) --> 2+1 =3
        n=5 --> fib(4)  +fib(3) --> 3+2 =5
        */
    }
    public static void main(String[]args) {
        for(int i=0;i<=10;i++) {
            System.out.println(fib(i)+" ");
        }
    }
}
