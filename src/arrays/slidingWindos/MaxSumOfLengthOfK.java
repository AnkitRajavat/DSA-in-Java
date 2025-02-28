package arrays.slidingWindos;

public class MaxSumOfLengthOfK {

    public static void main(String[] args) {
        int arr[]={-2,3,2,-4,5,8};
        int k=4;
        System.out.println(maxSum(arr,k));
    }
    public static int maxSum(int []arr, int k){
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        int j=0;
            int i=0;
            sum=0;
            while(j<arr.length){
                sum=sum+arr[j];
                if(j-i+1==k){
                    maxi=Math.max(sum,maxi);
                    j++;
                    sum=sum-arr[i];
                    i++;
                }
                else if(j-i+1<k){ j++;}
                else if(j-i+1>k){
                    sum=sum-arr[i];
                    i++;

                }
            }
        return maxi;
    }



/**
    public static int maxSum(int []arr, int k){
        int maxi=Integer.MIN_VALUE;

        int sum=0;
        for(int i=0;i<arr.length;i++){
            int p=k;
            int j=i;
            sum=0;
            while(j<arr.length){
                sum=sum+arr[j];
                if(j-i+1==k){
                    maxi=Math.max(sum,maxi);
                }
                else if(j-i+1<k) j++;


            }

        }
        return maxi;
    } **/





/**    public static int maxSum(int []arr,int k){
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                maxi=Math.max(sum,maxi);
            }
        }
        return maxi;
    }  **/


}
