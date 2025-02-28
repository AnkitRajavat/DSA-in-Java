package arrays.slidingWindos;

import java.util.ArrayList;
import java.util.List;

public class FirstNegetiveNumberInKthWindowSize {
    public static void main(String[] args) {
        int arr[]={-2,3,2,-4,5,8,8,9,2};
        int k=3;
        List<Integer> list=findAnswer(arr,k);
        System.out.println(list);
    }

    private static List<Integer> findAnswer(int[] arr, int k) {
        int i=0;
        int j=0;
        List<Integer>list=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        while(j<arr.length){
            if(arr[j]<0){
                list.add(arr[j]);
            }

             if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){

                if(list.isEmpty()){
                    ans.add(0);
                }
                else{
                    ans.add(list.get(0));
                    if(arr[i]==list.get(0)){
                        list.remove(0);
                    }
                }
                j++;
                i++;
            }

        }
        return ans;
    }
}
