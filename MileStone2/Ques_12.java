package MileStone2;

import java.util.Scanner;

public class Ques_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input2 = in.nextInt();
        int[] input1 = new int[input2];
        for (int i = 0; i < input2; i++) {
            input1[i] = in.nextInt();
        }
        System.out.println(SumPrime(input1,input2));
    }
    public static int SumPrime(int[] input1,int input2)
    {
        int sum =0,temp1=0,min = Integer.MAX_VALUE,min1=Integer.MAX_VALUE, temp=0;
        for (int i = 0; i < input2; i++) {

            temp1+=input1[i];
            if(input1[i]<min1)
            {
                min1 = input1[i];
            }

            if(isPrime(input1[i])){
                sum+=  input1[i];
                if(input1[i]<min)
                {
                    min = input1[i];
                }
            } else {
                ++temp;
            }
        }
        if(temp==input2) {
            return temp1-min1;
        } else {
            return sum-min;
        }
    }
    public static boolean isPrime(int a)
    {
        int c=0;
        if(a==0 || a==1) {
            return false;
        }
        else if(a==2) {
            return true;
        }
        else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    ++c;
                }
            }
            if (c == 0) {return true;}
            else {return false;}
        }
    }
}
