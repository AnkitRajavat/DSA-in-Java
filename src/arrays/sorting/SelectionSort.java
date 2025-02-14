package arrays.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int []arr={4,1,2,3,7};
        for(int i=0;i<arr.length;i++){
            int SI=i;
            for(int j=i+1;j<arr.length;j++){

                if(arr[j]<arr[SI]){
                    SI=j;
                }
            }
                int temp=arr[i];
                arr[i]=arr[SI];
                arr[SI]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
