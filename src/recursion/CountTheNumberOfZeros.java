package recursion;

public class CountTheNumberOfZeros {
    public static void main(String[] args) {
        System.out.println(countZero(102004,0));
    }

    private static int countZero(int n, int count) {
        if(n==0)
            return count;

        if(n%10==0)
            return countZero(n/10,count+1);
        else
            return countZero(n/10,count);
    }
}
