package arrays.cyclicsort;

import java.util.Arrays;

public class DuplicateNumber {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int findDuplicate(int[] arr) {

        int i=0;
        while(i<arr.length){
            int correct=arr[arr[i]-1];
            if(arr[i]!=i+1){
                if(arr[i]==correct){
                    return arr[i];
                }
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;}
        }

        return arr.length;
    }
}
