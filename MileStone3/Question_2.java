package MileStone3;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] input1 = new int[n];
        for (int i = 0; i < n; i++) {input1[i]=in.nextInt();}
        String[] answer = transformCodes(input1);
        for (String z: answer) {
            System.out.println(z);
        }
    }

    public static String[] transformCodes(int[] input1){

        // Code Starts from Here

        String[] answer = new String[input1.length];
        for (int i = 0; i < input1.length; i++) {
            int num = input1[i];
            int len = String.valueOf(num).length();
            StringBuilder sb = new StringBuilder();
            //Step 1
            if(len==6){
                sb.append('C');
            }else{
                sb.append('W');
            }

            //Step 2
            if(num==0){
                sb.append('Z');
            }
            else if(num==1){
                sb.append('O');
            }
            else if(isPrime(num)){
                sb.append('P');
            }else {
                sb.append('N');
            }

            //Step 3
            sb.append(sof(num));

            //Step4
            if(num%2==0){
                sb.append((num)/2);
            }else {
                sb.append((num-1)/2);
            }
            answer[i]= String.valueOf(sb);
            sb.delete(0,sb.length());
        }
        return answer;
    }

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        else {
            for (int i = 2; i <= n/2; i++) {
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static int sof(int n){
        int a;
        if(n<10){
            return n;
        }else{
            a = n%10;
            n = n/10;
            return sof(a+sof(n));
        }
    }
}
