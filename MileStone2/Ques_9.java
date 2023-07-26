package MileStone2;

import java.util.*;
/*9. Create PIN using three given input numbers(Corrected)

"Secure Assets Private Ltd", a small company that deals with lockers has recently started manufacturing digital locks which can be locked and unlocked using PINs (Passwords).
You have been asked to work onn the module that is expected to generate PINs using three input numbers.
Assumptions: The three given input numbers will always consist of four digits each i.e. each of them will be in the range >=1000 and <=9999
1000<=input1<=9999
1000<=input2<=9999
1000<=input3<=9999

Below are the rules for generating the PIN-
1. The PIN should made up of 4 digits.
2. The THOUSAND position of the PIN should be the digit with maximum frequency i.e. the digit that occurs the most number of times across the three input numbers. if there are more than one digit that occur with max frequency, choose the largest of them.
3. The HUNDRED position of the PIN should be the digit with minimum frequency
i.e. the digit that occurs the least number of times across the three input numbers. if there are more than one digit that occur with min frequency, choose the smallest of them.
4. The TENS position of the PIN should be the largest digit across the three input numbers.
5. The UNIT(ONES) position of the PIN should be the smallest digit across the three input numbers.

Example1-
input1=1724
input2=5283
input3=1937
then, PIN=7491*/

public class Ques_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        int input3 = in.nextInt();
        System.out.println(Question(input1,input2,input3));
    }

    public static int Question(int input1,int input2,int input3)
    {
        TreeMap<Integer,Integer>tm=new TreeMap<>();
        Frequency(tm,input1);
        Frequency(tm,input2);
        Frequency(tm,input3);
        int max = Collections.max(tm.keySet());     // Largest digit of all
        int min = Collections.min(tm.keySet());     // Smallest digit of all
        int max1 = Collections.max(tm.values());    // maximum Frequency
        int min1 = Collections.min(tm.values());    // minimum frequency

        for (int a1:tm.keySet()) {
            if(tm.get(a1)==min1)
            {
                min1 = a1;break;
            }
        }
        LinkedHashMap<Integer,Integer> r = new LinkedHashMap<>(tm.descendingMap());
        for (int a1:r.keySet()) {
            if(r.get(a1)==max1)
            {
                max1 = a1;break;
            }
        }
        return (max1*1000)+(min1*100)+(max*10)+min;

    }
    public static void Frequency(TreeMap<Integer,Integer> a,int b)
    {
        while (b>0)
        {
            int temp = b%10;
            b/=10;
            if(a.containsKey(temp))
            {
                int c = a.get(temp);
                a.put(temp,++c);
            }
            else
            {
                a.put(temp,1);
            }
        }
    }
}
