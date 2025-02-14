package arrays.sorting;

import java.util.Arrays;

import static java.util.Collections.swap;



public class BubbleSort {
    public static void main(String[] args) {
        int []arr={4,1,2,3,7};
        for(int i=0;i<arr.length;i++){
            boolean istrue=false;
            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    istrue=true;
                }
            }
            if(!istrue){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
