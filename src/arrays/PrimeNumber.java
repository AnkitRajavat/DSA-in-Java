package arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=10;
        System.out.println(countPrimes(n));
    }
    static boolean isprime(int n){
        int count=0;
        for(int i=2;i<=Math.pow(n,0.5);i++){
            if(n%i==0){
                count=1;
                break;
            }
        }
        if(count==0)
            return true;
        else
            return false;
    }
    public static int countPrimes(int n) {
        if(n==0|| n==1)
            return 0;
        int count=0;
        for(int i=2;i<n;i++){
            if(isprime(i)){
                count++;
            }
        }
        return count;
    }
}
