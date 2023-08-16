package MileStone3;

/*6. String Reverse Words and Case
sentence) and generates a new String (modified sentence) by reversing the words in the original String, maintaining the words position.
In addition, the function should be able to control the reversing of the case(uppercase and lowercase) based on a case_option parameter, as follows -

If case_option = 0, Normal reversal of words, i.e., If the original sentence is "Wipro TechNologies BangaLore", the new reversed sentence should be "orpiW seigoloNhceT eroLagnaB".

If case_option = 1, Reversal of words with retaining position's case. i.e. If the original sentence is "Wipro TechNologies BangaLore" the new reversed sentence should be "Orpiw SeigOlohcet ErolaGnab".

Note that positions 1,7,11,20 and 25 in the original string are uppercase W,T,N,B and L.

Similarly, positions 1,7,11,20 and 25 in the new string are uppercase O, S, O, E and G.

Prototype: String reverseWordsAndCase(String input1, int input2)

Note:
1. Only space characters should be treated as the word seperator. i.e., "Hello World" should be treated as two seperate words "Hello" and "World". However, "Hello World", "Hello;World", "Hello-World" or "Hello/World" should be considered as a single word.

2. Non-alphabetic characters in the string should not be subjected to case changes. For example, if case_option = 1 and the original sentence is "Wipro TechNologies, Bangalore" the new reversed sentence should be "Orpiw, selGolonhceT Erolagnab". Note that comma has been treated as part of the word "Technologies," and when comma had to take the position of uppercase T it remained as a comma and uppercase T look the position of comma. However, the words "Wipro and Bangalore" have changed to "Orpiw" and "Erolagnab".

3. Kindly ensure that no extra(additional) space characters are embedded within the resultant reversed String.

Examples:

S. No.		input1							input2			output
1		Wipro Technologies Bangalore				0			orpiW seigolonhceT erolagnaB
2		Wipro Technologies, Bangalore				0			orpiW ,seigolonhceT erolagnaB
3		Wipro Technologies Bangalore				1			Orpiw Seigolonhcet Erolangnab
4		Wipro Technologies, Bangalore				1			Orpiw ,seigolonhcet Erolangnab*/

import java.util.*;

public class Question_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        int input2 = in.nextInt();
        System.out.println(reverseWordsAndCase(input1,input2));
    }
    public static  String reverseWordsAndCase(String input1, int input2){

        // Code Starts Here

        String[] a1 = input1.split(" ");
        String s1="";
        for (int i = 0; i < a1.length; i++) {
            StringBuilder sb = new StringBuilder(a1[i]).reverse();
            s1+= sb+" ";
        }
        if (input2==1)
        {
            String sb = s1.toLowerCase().trim();
            s1="";
            for (int i = 0; i < sb.length(); i++) {
                char ch = input1.charAt(i);
                char co = sb.charAt(i);
                if(Character.isUpperCase(ch)){s1+=String.valueOf(co).toUpperCase();}
                else {s1+=co;}
            }
        }
        return s1.trim();
    }
}
