package arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int [] nums1={2,0};
        int [] nums2={1};
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int [] arr=new int[nums1.length];
        if(n==0)
            return ;

        while(i<nums1.length && j<nums2.length && k<arr.length){
            if(nums1[i]>nums2[j] ){
                arr[k]=nums2[j];
                j++;
            }
            else if(nums1[i]<=nums2[j] && nums1[i]!=0){
                arr[k]=nums1[i];
                i++;
            }
            else if(nums1[i]<=nums2[j] && nums1[i]==0){
                arr[k]=nums2[j];
                j++;}
            else{
                arr[k]=nums1[i];
                i++;
            }
            ++k;
        }
        int p=0;
        for(int l:arr){
            nums1[p++]=l;
        }
    }
}
