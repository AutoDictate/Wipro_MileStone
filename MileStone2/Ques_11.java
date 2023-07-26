package MileStone2;

import java.util.Scanner;

/*11.  Find PIN:
You are at Level-1 of a Maths Game.
You are provided with 4 numbers: input1, input2, input3 and input4 and are expected to find a secret PIN.
The three numbers input1, input2 and input3 are four digit numbers within the range >=1000 and <=9999. i.e.
1000<=input1<=9999
1000<=input2<=9999
1000<=input3<=9999

input4 is a positive integer number.

if input4 is EVEN, the PIN =(sum of even digits in input1, input2 and input3)-(sum of odd digits in input1,input2 and input3)
if input4 is ODD, the PIN=(sum of odd digits in input1, input2 and input3)-(sum of even digits in input1, input2 and input3)

Example1-
if input4=38(an EVEN number) and if input1=3521, input2=2452, input3=1352. then PIN=(2+2+4+2+2)-(3+5+1+5+1+3+5)=-11
Example2-
if input4=37(an ODD number) and if input1=3521,input2=2452, input3=1352, then PIN=(3+5+1+5+1+3+5)-(2+2+4+2+2)=11

Assuming that the 4 numbers are passed to the given function, complete the function to find and return the PIN.*/

public class Ques_11 {
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
        if(input4%2==0)
        {
            return (Even(input1)+Even(input2)+Even(input3))  - (Odd(input1)+Odd(input2)+Odd(input3));
        }
        else
        {
            return (Odd(input1)+Odd(input2)+Odd(input3))-(Even(input1)+Even(input2)+Even(input3));
        }
    }
    public static int Even(int input)
    {
        int n = 0;
        while (input>0)
        {
            int temp = input%10;
            if(temp%2==0)
            {
                n+=temp;
            }
            input/=10;
        }
        return n;
    }
    public static int Odd(int input)
    {
        int n = 0;
        while (input>0)
        {
            int temp = input%10;
            if(temp%2!=0)
            {
                n+=temp;
            }
            input/=10;
        }
        return n;
    }
}

