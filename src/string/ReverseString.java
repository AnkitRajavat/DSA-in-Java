package string;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("ankit"));

    }

    private static String reverseString(String ankit) {
        String s="";
        int l=ankit.length();
        for(int i=0;i<l;i++){
            s=ankit.charAt(i)+s;
        }
        return s;
    }
}
