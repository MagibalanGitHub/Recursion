import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();

        String rev=reverse(str);
        System.out.println(rev);
    }
    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
        /*
        reverse("hello") ---> reverse("ello")+"h";    //rev("hello")-->"olle"+"h";  -->"olleh";
        reverse("ello") ---> reverse("llo")+"e";      //rev("ello")-->"oll"+"e";
        reverse("llo") ---> reverse("lo")+"l";        //rev("llo")-->"ol"+"l";
        reverse("lo") ---> reverse("o")+"l";          // rev("lo") -->"o"+"l";
        reverse("o") ---> "o";                        //rev("o")-->"o";

        */
    }
}
