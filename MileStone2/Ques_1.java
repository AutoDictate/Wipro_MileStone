package MileStone2;
/*

You are at Level-1 of a Maths Game.
You are provided with 4 numbers: input1, input2, input3 and input4 and are expected to find a secret PIN.
The three numbers input1, input2 and input3 are four digit numbers within the range >=1000 and <=9999. i.e.
1000<=input1<=9999
1000<=input2<=9999
1000<=input3<=9999

input4 is a positive integer number.

PIN=((MAX digit of input1 X MIN digit of input1) X (MAX digit of input2 X MIN digit of input2) X (MAX digit of input3 X MIN digit of input3)) - input 4.

Example - If input1=3521, input2=2452, input3=1352, and input4=38,
then PIN=((5x1)x(5x2)x(5x1))-38 = (5x10x5) - 38 = 212

Assuming that the 4 numbers are passed to the given function, complete the given function to find and return the PIN. */

import java.util.Scanner;

public class Ques_1 {
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
        if(input4>0)
        {
            return (Maxi(input1)*Maxi(input2)*Maxi(input3))-input4;
        }
        else
        {
            return 1;
        }
    }
    public static int Maxi(int input)
    {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        while (input>0)
        {
            int temp = input%10;
            if(temp>max)
            {
                max = temp;
            }
            if(temp<min)
            {
                min = temp;
            }
            input/=10;
        }
        return max*min;
    }
}
