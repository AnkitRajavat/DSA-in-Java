package arrays.slidingWindos.variableSize;

import java.util.HashMap;
import java.util.Map;

public class LargestSubstringWithKCharacters {
    public static void main(String[] args) {


    String arr="ababcbebebe";
      int k=3;
        System.out.println(maxSubArrayLength(arr,k));
}

public static int maxSubArrayLength(String s, int k){
    int maxi=0;
    int j=0;
    int i=0;
    Map<Character,Integer> mp= new HashMap<>();
    while(j<s.length()){
        if(mp.containsKey(s.charAt(j)))
        mp.put(s.charAt(j),mp.get(s.charAt(j))+1);
        else
            mp.put(s.charAt(j),1);


        while(mp.size()>k && i<=j) {
            mp.replace(s.charAt(i),mp.get(s.charAt(i))-1);
            if(mp.get(s.charAt(i))==0){
                mp.remove(s.charAt(i));
            }
            i++;
        }



        if(mp.size()==k){
            maxi=Math.max(j-i+1,maxi);

        }


        j++;
    }
    return maxi;
}


}
