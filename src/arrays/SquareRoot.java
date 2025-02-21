package arrays;

public class SquareRoot {
    public static void main(String[]args){
        System.out.println(mySqrt(2147395599));
    }
    public static int mySqrt(int x) {
        int maxi=Integer.MIN_VALUE;
        if(x==0 || x==1)
            return x;

        for(int i=1;i<=x/2;i++){

            if(i*i==x){
                return i;

            }
            else if(i*i<x){
                if(i>maxi)
                    maxi=i;

            }
            else if(i*i>x){
                break;
            }
        }
        return maxi;
    }
}
