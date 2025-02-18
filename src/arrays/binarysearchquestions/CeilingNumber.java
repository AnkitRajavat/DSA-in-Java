package arrays.binarysearchquestions;

import java.util.Arrays;

public class CeilingNumber {
    public static void main(String[] args) {
        int [] arr={2,3,5,9,14,16,18};
        System.out.println(Arrays.toString(arr));

        System.out.println(binarysearch(arr,5));
    }

    static int binarysearch(int[] arr, int target) {
        int answer =Integer.MIN_VALUE;
        int start=0;
        int end=arr.length;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                answer=arr[mid];
                return answer;
            }
            else if(arr[mid]<target){
                if(arr[mid]>answer){
                    answer=arr[mid];
                }
                start=mid+1;
            }
            else {
                if(arr[mid]>answer){
                    answer=arr[mid];
                }
                end=mid-1;
            }}

        return answer;
    }

}
