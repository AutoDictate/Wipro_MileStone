package MileStone3;

import java.util.Arrays;
import java.util.Scanner;

public class Question_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        int input3 = in.nextInt();
        int input4 = in.nextInt();
        System.out.println(useridGeneration(input1, input2, input3, input4));
    }

    public static String useridGeneration(String input1, String input2, int input3, int input4) {

        // Code Starts Here

        String[] a = {input1, input2};
        if (input1.length() == input2.length()) {
            Arrays.sort(a);
        } else {
            a[0] = input1.length() < input2.length() ? input1 : input2;
            a[1] = input1.length() > input2.length() ? input1 : input2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(input3);
        String temp = "";
        String userid = "";
        temp += a[0].charAt(0) + a[1] + sb.charAt(input4 - 1) + sb.reverse().charAt(input4 - 1);
        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                userid += String.valueOf(ch).toUpperCase();
            } else {
                userid += String.valueOf(ch).toLowerCase();
            }
        }
        return userid;
    }
}
