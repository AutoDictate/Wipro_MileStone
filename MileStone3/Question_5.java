package MileStone3;

/*5. Toggle the String

 Anju and Aman are close friends. There are playing a game on toggling of strings. Anju has given certain instructions to Aman to toggle a String. Help Aman to find the correct output.

 Given a String input1, based on input2 return the output as follows:
 Case1: If input2 is 0, extract and toggle the character at even indexes and return the concatenated output.
 Case2: If input2 is 1, extract and toggle the character at odd indexes and return the concatenate output.
 Case3: If input2 is 2, reverse the String and return the toggled output.

 Example1:
 input1: Wipro
 input2: 0
 output:wPO
 Explanation: W, p and o are at even indexes. After toggling, the values are w,P and O. Hence, the concatenated output is wPO.

 Example2:
 input1:TechnolOgY
 input2:1
 output:EHOoy
 Explanation: e,h,o,O and Y are at odd indexes. After toggling, the values are E, H, O, o and y. Hence, the concatenated output is EHOoy

 Example3:
 input1: CHEnnAi
 input2:2
 output: laNNehc
 Explanation: Input String is reversed and all the characters are toggled.

 Note: Input String will be a single word containing only alphabets*/


import java.util.*;

public class Question_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        int input2 = in.nextInt();
        System.out.println(toToggle(input1,input2));
    }

    public static String toToggle(String input1, int input2){

        // Code Starts from Here//

        String s1="";
        String s2="";
        for (int i = 0; i < input1.length(); i++) {
            char ch = input1.charAt(i);
            if(ch>='a'&&ch<='z'){
                s1+=String.valueOf(ch).toUpperCase();
            }else {
                s1+=String.valueOf(ch).toLowerCase();
            }
        }
        if(input2==0) {
            for (int i = 0; i < s1.length(); i++) {
                if(i%2==0){
                    s2+=s1.charAt(i);
                }
            }
        }
        if(input2==1)
        {
            for (int i = 0; i < s1.length(); i++) {
                if(i%2!=0){
                    s2+=s1.charAt(i);
                }
            }
        }
        if(input2==2)
        {
           for (int i = input1.length()-1; i >=0; i--) {
                s2+=s1.charAt(i);
            }
        }
        return s2;
    }
}
