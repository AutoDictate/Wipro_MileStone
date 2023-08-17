package MileStone3;

import java.util.Arrays;
import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();
        String input3 = in.next();
        System.out.println(question1(input1,input2,input3));
    }
    public static String question1(String input1, String input2, String input3){

        // Code Starts from here.
        String[] a = Three(input1);
        String[] b = Three(input2);
        String[] c = Three(input3);

        String[] ans = {a[0]+b[1]+c[2],a[1]+b[2]+c[0],Char(a[2]+b[0]+c[1])};
        return Arrays.toString(ans);

    //  return new Result(ans[0],ans[1],ans[2]);
    }

    public static String[] Three(String s){
        int n=s.length()/3;
        int m = s.length()%3;
        if(m==0)
            return new String[]{s.substring(0, n),s.substring(n,n+n),s.substring(n+n)};
        if(m==1)
            return new String[]{s.substring(0, n),s.substring(n,n+n+1),s.substring(n+n+1)};
        else
            return new String[]{s.substring(0, n+1),s.substring(n+1,n+n+1),s.substring(n+n+1)};
    }
    public static String Char(String s){
        String st ="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c>='a'&&c<='z'){
                st+=String.valueOf(c).toUpperCase();
            }else {
                st+=String.valueOf(c).toLowerCase();
            }
        }
        return st;
    }
}
