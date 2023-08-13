package MileStone3;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] input1 = new int[n];
        for (int i = 0; i < n; i++) {input1[i]  = in.nextInt();}
        char[] ch = smallelement(input1);
        for (char c: ch) {
            System.out.println(c);
        }
    }

    public static char[] smallelement(int[] input1){

        // Code Starts from here.

        int l = input1.length;      // l -> L
        char[] ch = new char[l];
        int[] t = input1.clone();
        Arrays.sort(t);
        LinkedHashMap<Integer,Character> h = new LinkedHashMap<>();
        for (int i = 0; i < l; i++) {
            int a = 97 +i;
            h.put(t[i],(char)a);
        }
        int i=0;
        for (int z: input1){
            if(h.containsKey(z)){
                ch[i] = h.get(z);i++;
            }
        }
        return ch;
    }
}
