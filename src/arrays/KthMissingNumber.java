package arrays;

public class KthMissingNumber {
    public static void main(String[] args) {
        int [] arr={2,3,4,7,11};
        System.out.println(findKthPositive(arr,5));
    }
    public static int findKthPositive(int[] arr, int k) {
        int count=0;

        for(int i=1;i<=1000;i++){
            if(binarySearch(i,arr)){

            }
            else{
                count++;
                if(count==k){
                    return i;
                }

                if(count>k)
                    break;
            }
        }
        return -1;
    }
    static boolean  binarySearch(int i,int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==i){
                return true;
            }
            else if(i<arr[mid]){
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}
