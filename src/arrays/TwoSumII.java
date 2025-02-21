package arrays;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int []arr={2,7,11,12};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int []arr={-1,-1};
        for(int i=0;i<numbers.length;i++){
            arr[0]=i+1;
            int ans=findpair(numbers,target-numbers[i],false);
            if(ans!=-1){
                arr[1]=ans+1;
                break;
            }
        }
        return arr;

    }
    static int findpair(int []arr,int num,boolean istrue){
        int start=0;
        int ans=-1;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==num){
                ans= mid;
                if(istrue){
                    mid=end-1;
                }
                else
                    start=mid+1;

            }
            else if(arr[mid]>num)
                end=mid-1;
            else
                start=mid+1;
        }
        return ans;
    }
}
