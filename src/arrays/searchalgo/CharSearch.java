package arrays.searchalgo;

public class CharSearch {
    public static void main(String[] args) {
        String str="ankit";
        System.out.println(findchar(str,'n'));
    }

    private static boolean findchar(String str,char p) {
        if(str.length()==0){
            return false;
        }
        for(char c: str.toCharArray()){
            if(c==p)
                return true;

        }
        return false;
    }
}
