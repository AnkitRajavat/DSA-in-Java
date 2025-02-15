package arrays.searchalgo;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));

        System.out.println(binarysearch(arr,5));
    }

     static int binarysearch(int[] arr, int target) {
        int start=0;
        int end=arr.length;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                end=mid-1;
            }}

         return Integer.MIN_VALUE;
     }


}
