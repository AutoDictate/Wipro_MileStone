package MileStone3;

import java.util.LinkedList;
import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(fixTheFormula(input1));
    }
    public static int fixTheFormula(String input1){

        // Code starts Here

        LinkedList<Integer> h = new LinkedList<>();
        LinkedList<Character> s = new LinkedList<>();
        for (int i = 0; i < input1.length(); i++) {
            char ch = input1.charAt(i);
            if(ch>='0' && ch<='9'){
                h.add(Integer.parseInt(String.valueOf(ch)));
            } else if(ch=='+' || ch=='-' || ch=='*' || ch=='/') {
                s.add(ch);
            }
        }
        int l = s.size();
        int ans = h.get(0);
        for (int i = 0; i < l; i++) {
            int a=h.get(i+1);
            char c = s.get(i);
            if(c=='+'){
                ans += a;
            } else if (c=='-') {
                ans -= a;
            } else if (c=='*') {
                ans*=a;
            }else if (c=='/'){
                ans/=a;
            }
        }
        return ans;
    }
}
