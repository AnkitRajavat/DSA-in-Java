package arrays.searchalgo;

import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args) {


        int[][] arr = {
                {1, 3, 5},
                {5, 3, 2, 7, 8},
                {6, 8, 3, 2, 5},
                {2, 3, 4, 5}

        };

        System.out.println(Arrays.toString(searchele(arr,5)));
    }

  static int[] searchele(int[][] arr, int k) {

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
