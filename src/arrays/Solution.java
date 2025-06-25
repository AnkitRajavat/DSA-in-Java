package arrays;

class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int maxi=0;
        
        int [] arr=new int[gain.length+1];
        arr[0]=0;
        for(int i=0;i<gain.length;i++){
            int j=i;
            arr[j+1]=gain[i]-Math.abs(arr[i]);

            if(maxi<arr[i+1]){
                maxi=arr[i+1];
            }
        }
return maxi;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int [] arr={-5,1,5,0,-7};
        System.out.println(s.largestAltitude(arr));
    }
}