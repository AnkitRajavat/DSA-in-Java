package recursion;

public class Fibbancci {
    public static void main(String[] args) {
        int ans=fibbo(50);
        System.out.println("ans = " + ans);
    }
    static int fibbo(int n){

        if(n<2)
            return n;

        return fibbo(n-1)+fibbo(n-2);
    }
}
