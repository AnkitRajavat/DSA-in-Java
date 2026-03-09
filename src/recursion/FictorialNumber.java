package recursion;

public class FictorialNumber {
    public static void main(String[] args) {
        System.out.println(factorialNumber(5));
    }

    private static int factorialNumber(int i) {
        if(i==1)
            return i;
        return i*factorialNumber(i-1);
    }
}
