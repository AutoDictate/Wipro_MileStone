package MileStone_4;

public class String_Weights {
    public static void main(String[] args) {
        int[] a  ={15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,67,12,0,13,2,3,43,21,-17,2,42};
        String b = "Wipro Limited";
        System.out.println(StringWeight(a,b));
    }
    public static int StringWeight(int[] input1, String input2){

        // Write Code from here.

        String[] a1 = input2.toUpperCase().split(" ");
        int a=1;
        for (String s : a1) {
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                int t=input1[s.charAt(j)-65];
                if ((j==0 || j==s.length()-1) && t < 0) {
                    sum += (t+(s.charAt(j)-64));
                } else{sum+=t;}
            }
            a *= sum;
        }
        return a;
    }
}
