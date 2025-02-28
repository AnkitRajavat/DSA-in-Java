package arrays;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        //int [] arr={3,3,7,7,10,11,11};
        int []arr={2,3,3,4,4};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid==0) {
                return arr[mid];
            }

            if(arr[mid]==arr[mid-1]){
                if((mid-1)%2!=0)
                    end=mid-1;
                else
                    start=mid+1;
            }
            else if(arr[mid]==arr[mid+1])
            {
                if((end-mid-1)%2!=0)
                    start=mid+1;
                else
                    end=mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }
}
