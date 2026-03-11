package recursion.arrays;

public class FindElement {
    public static void main(String[] args) {
        int [] arr={1,4,3,5,6};
        System.out.println(findElement(arr,5,0));
        System.out.println(findIndex(arr,5,0));
    }

    private static int findIndex(int[] arr, int target, int i) {
        if(i==arr.length)
            return -1;

        if(arr[i]==target)
            return i;
        else
            return findIndex(arr,target,i+1);
    }

    static boolean findElement(int[] arr, int target, int i) {

        if(i==arr.length-1)
            return false;

        return arr[i]==target || findElement(arr,target,i+1);
    }
}
