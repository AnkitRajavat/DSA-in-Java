package arrays.slidingWindos.variableSize;

public class LargestSubArrayOfK {
    public static void main(String[] args) {
        //int arr[]={4,1,-4,1,2,3,5};
        int arr[]={-5,1,-4,1,2,3,5};
        int k=-5;
        System.out.println(maxSubArrayLength(arr,k));
    }
    public static int maxSubArrayLength(int []arr, int k){
        int maxi=0;
        int sum=0;
        int j=0;
        int i=0;

        while(j<arr.length){
            sum=sum+arr[j];

                while(sum>k && i<=j) {
                    sum = sum - arr[i];
                    i++;
                }



            if(sum==k){
                maxi=Math.max(j-i+1,maxi);

            }


            j++;
            }
        return maxi;
        }



}
