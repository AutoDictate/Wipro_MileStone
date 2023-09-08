package MileStone_4;

import java.util.Arrays;
import java.util.HashMap;

public class Pin_mafmif {
    public static void main(String[] args) {
        int a=1274;
        int b=5283;
        int c=7654;
        System.out.println(Pin(a,b,c));

    }
    public static int Pin(int input1, int input2, int input3){

        // Write code from Here.

        int max,min,maxf=0,minf=9;
        String s = ""+input1+input2+input3;
        char[] c = s.toCharArray();
        Arrays.sort(c);
        max = Integer.parseInt(""+(c[c.length-1]));
        min = Integer.parseInt(""+(c[0]));
        HashMap<Integer,Integer> h = new HashMap<>();
        for (char c1 : s.toCharArray()) {
            int t = Integer.parseInt(""+(c1));
            System.out.print(t+" ");
            if(h.containsKey(t)){
                int co = h.get(t);
                h.put(t,++co);
            }else {h.put(t,1);}
            if(h.get(t)>=maxf){maxf = t;}
            if(h.get(t)<minf){minf = t;}
        }
        String pin = ""+maxf+minf+min+max;
        return Integer.parseInt(pin);
    }
}
