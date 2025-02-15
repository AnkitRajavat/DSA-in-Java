package arrays.searchalgo;

public class MininumElement {
    public static void main(String[] args) {
        int [] arr={1,4,2,5,7,8,9,65};

        System.out.println(searchelement(arr));
    }

    private static int searchelement(int[] arr) {
        if(arr.length==0){
            return -1;
        }
        int mini=Integer.MAX_VALUE;
        for(int k :arr){
            if(k<mini){
                mini=k;
            }
        }
        return mini;
    }
}
