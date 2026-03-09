package recursion;

public class DigitSUm {
    public static void main(String[] args) {
        System.out.println(digitSum(234));
    }

    private static int digitSum(int i) {
        if(i%10==0)
            return i;

        return i%10+digitSum(i/10);
    }
}
