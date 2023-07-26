package MileStone2;

import java.util.Scanner;

/*16. Calculate sum of prime index values in an array:

Given an array of n-elements, you are expected to find the sum of values that are present in the prime indexes of the array.
Example: If the array elements are {10,20,30,40,50,60,70,80,90,100}, then the values at prime indexes are 30,40,60,80.
Their sum is 210.*/

public class Ques_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {a[i] = in.nextInt();}
        System.out.println(PrimeIndex(a,n));
    }

    public static int PrimeIndex(int[] input1,int input2)
    {
        int sum=0;
        for (int i = 0; i < input2; i++) {
            if(isPrime(i))
            {
                sum+=input1[i];
            }
        }
        return sum;
    }
    public static boolean isPrime(int a)
    {
        int c=0;
        if(a==0 || a==1) {return false;}
        else if(a==2) {return true;}
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