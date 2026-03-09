package recursion.arrays;

public class IsSortedArray {
    public static void main(String[] args) {

        int [] arr={0,1,2,3,4,5};
        System.out.println(sorted(arr,0));
    }

    private static boolean sorted(int[] arr, int i) {
        if(i==arr.length-1)
            return true;

        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }
}
