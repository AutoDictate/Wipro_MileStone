package MileStone2;

import java.util.*;

/*14. Find the first repeated element in the given array from the tail of the array:
Rajeev works on the data center lab of the survey department. he has been assigned the task of identifying "Repeated numbers" in a given set of numbers. He approaches you to help him acheive this.
Given an array of numbers, your task is to return the first number that repeats (appears again) starting from the last index.

For example:
if input1={1,2,4,1,2,8} representing the given array, and input2=6 representing the number of element in the array.
then the result should be 2 which is the first repeated number in the array from the rear end.

Special conditions to taken care:
---------------------------------
Note 1: you should ignore the negative numbers and zeros. The program should consider only non-zero, non-negative numbers from the given array.
Note 2: If no number is repeated then the output should be the last element of the array.
Note 3: If all the elements in the array are negative or 0's, the output should be 0.*/

public class Ques_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {a[i] = in.nextInt();}
        System.out.println(HashFFT(a,n));
    }

    public static int HashFFT(int[] input1,int input2)
    {
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = input2-1; i >=0 ; i--) {
            if(input1[i]>0)
            {
                if(h.containsKey(input1[i]))
                {
                    return input1[i];
                }
                h.put(input1[i],1);
            }
        }
        if(h.isEmpty()){return 0;}
        return input1[input2-1];
    }
}