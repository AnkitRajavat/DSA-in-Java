package arrays;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }
    public static boolean isPerfectSquare(int num) {
        if(num==1|| num==0){
            return true;
        }
        int start=1;
        int end=num/2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==num){
                return true;
            }
            else if((long)mid*mid >(long)num){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}
