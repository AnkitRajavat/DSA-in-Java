package arrays;

public class MaximumElement {
    public static void main(String[] args) {
        int [] arr={3,5,42,6,7,8};
        int maxi=Integer.MIN_VALUE;
        for(int i: arr){
            if(i>maxi){
                maxi=i;
            }
        }
        System.out.println("maxi = " + maxi);
    }
}
