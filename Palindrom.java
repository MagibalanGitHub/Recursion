import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char ch[]=str.toCharArray();
        System.out.println(palindrome(ch,0,ch.length-1));
    }
    public static boolean palindrome(char str[],int first,int last){
        if(first>=last){
            return true;
        }
        if(str[first]!=str[last]){
            return false;
        }
        return palindrome(str,first+1,last-1);
    }
}
