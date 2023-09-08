package MileStone_4;

import java.util.Arrays;
import java.util.HashMap;

public class Three_Parts {
    public static void main(String[] args) {

        int[] a = {12,2,36,10,217,36,5,36,15,10};
        int b = a.length;
        System.out.println(ThreeParts(a,b));
    }
    public static int ThreeParts(int[] input1, int input2){
        Arrays.sort(input1);
        HashMap<Integer,Integer> h = new HashMap<>();
        int max=0,max2=0,min=250;
        int a=0,b=0,c=0;    // a= max fre b = least value c = second min fre
        for(int z: input1){
            if(h.containsKey(z)){
                int co = h.get(z);
                h.put(z,++co);
            }else {h.put(z,1);}
            int t = h.get(z);
            if(t>=max){
                max = t;a=z;
            }
            if(t<min && z<min){
                min = t;b=z;
            }
        }
        for(int z:h.keySet()){
            if(h.get(z)<max && h.get(z)>max2){
                max2 = h.get(z);c=z;
            }
        }
        String s = ""+a+c+b;
        return Integer.parseInt(s);
    }
}
