package arrays.cyclicsort;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int [] arr={3,5,2,1,4};
        
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {
        int i=0;
        while(i<arr.length){
            
            
            if(i==arr[i]-1){
                i++;
            }
            else{
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
        }
        
    }
}
