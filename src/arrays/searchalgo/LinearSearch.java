package arrays.searchalgo;

public class LinearSearch {

    public static void main(String[] args) {
        int [] arr={1,4,2,5,7,8,9,65};

        System.out.println(searchelement(arr,-5));
    }

    private static int searchelement(int[] arr, int i) {
        if(arr.length==0){
            return -1;
        }
        for(int k :arr){
            if(k==i){
                return 1;
            }
        }
        return -1;
    }
}
