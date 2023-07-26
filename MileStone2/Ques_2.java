package MileStone2;

import java.util.Scanner;
/*2. Find PIN:(Correct)
You are at Level-1 of a Maths Game.
You are provided with 4 numbers: input1, input2, input3 and input4 and are expected to find a secret PIN.
The three numbers input1, input2 and input3 are four digit numbers within the range >=1000 and <=9999. i.e.
1000<=input1<=9999
1000<=input2<=9999
1000<=input3<=9999

input4 is a positive integer number.

If input4 is EVEN, the PIN = (sum of EVEN POSITIONED digits of input1 input2 input3) - (sum of ODD POSITIONED digits of input1 and input2 and input3)
If input4 is ODD, the PIN = (sum of ODD POSITIONED digits of input1 input2 input3) - (sum of EVEN POSITIONED digits of input1 and input2 and input3)

Example1 - If input4=38(an EVEN number) and if input1=3521, input2=2452, input3=1352, then PIN =(3+2+2+5+1+5)-(5+1+4+2+3)=1

Example2 - If input4 =37 (an ODD number) and if input1=3521.
*/
public class Ques_2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int input1 = in.nextInt();
            int input2 = in.nextInt();
            int input3 = in.nextInt();
            int input4 = in.nextInt();
            System.out.println(Question(input1,input2,input3,input4));
        }
        public static int Question(int input1,int input2,int input3,int input4)
        {
            int even,odd;
            if(input4 % 2 ==0)
            {
                even = (input1/1000)+(input1/10)%10  +  (input2/1000)+(input2/10)%10  +   (input3/1000)+(input3/10)%10;
                odd = (input1/100)%10+(input1%10)  +  (input2/100)%10+(input2%10)  +   (input3/100)%10+(input3%10);
                return even-odd;
            }
            else
            {
                even = ( input1 / 1000 ) + ( input1 / 10 ) % 10 + ( input2 / 1000 ) + ( input2 / 10 ) % 10 + ( input3 / 1000 ) + ( input3 / 10 ) % 10;
                odd = ( input1 / 100 ) % 10 + ( input1 % 10 ) + ( input2 / 100 ) % 10 + ( input2 % 10 ) + ( input3 / 100 ) % 10 + ( input3 % 10 );
                return odd - even;
            }

        }
}
