package MileStone2;

import java.util.Scanner;
/*3. Find PIN:(Corrected)
You are at Level-1 of a Maths Game.
You are provided with 4 numbers: input1, input2, input3 and input4 and are expected to find a secret PIN.
The three numbers input1, input2 and input3 are four digit numbers within the range >=1000 and <=9999. i.e.
1000<=input1<=9999
1000<=input2<=9999
1000<=input3<=9999

input4 is a positive integer number.

PIN = ((smallest digit in input1) x (LARGEST digit in input2) x (smallest digit in input3)) - input4

Example - If input1=3521, input2=2452, input3=1352, and input4=38, then PIN=(1x5x1)-38=-33

Assuming that the 4 numbers are passed to the given function, Complete the function to find and return the PIN.
*/
public class Ques_3 {
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
        return (Minimum(input1)*Maximum(input2)*Minimum(input3))-input4;
    }
    public static int Minimum(int input)
    {
        int min = 10000;
        while (input>0)
        {
            int temp = input%10;
            if(temp<min)
            {
                min=temp;
            }
            input/=10;
        }
        return min;
    }
    public static int Maximum(int input)
    {
        int max = 0;
        while (input>0)
        {
            int temp = input%10;
            if(temp>max)
            {
                max=temp;
            }
            input/=10;
        }
        return max;
    }
}
