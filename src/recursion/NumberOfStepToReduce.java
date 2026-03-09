package recursion;

public class NumberOfStepToReduce {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    private static int numberOfSteps(int i) {
        return helper(i,0);
    }

    private static int helper(int i, int count) {
        if(i==0)
            return count;


        if(i%2==0)
            return helper(i/2,count+1);
        else
            return helper(i-1,count+1);
    }
}
