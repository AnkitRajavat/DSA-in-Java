package arrays.cyclicsort;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1,4};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {

        int i = 0;
        while (i < arr.length) {

            if ( arr[i]!=i && arr[i] < arr.length) {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;

            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j])
                return j;

        }


        return arr.length;

    }
}