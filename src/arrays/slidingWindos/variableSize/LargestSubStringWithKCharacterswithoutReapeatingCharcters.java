package arrays.slidingWindos.variableSize;

import java.util.HashMap;
import java.util.Map;

public class LargestSubStringWithKCharacterswithoutReapeatingCharcters {
    public static void main(String[] args) {


        String arr="pwwkewt";

        System.out.println(maxSubArrayLength(arr));
    }

    public static int maxSubArrayLength(String s){
        int maxi=0;
        int j=0;
        int i=0;
        Map<Character,Integer> mp= new HashMap<>();
        while(j<s.length()){
            if(mp.containsKey(s.charAt(j)))
                mp.put(s.charAt(j),mp.get(s.charAt(j))+1);
            else
                mp.put(s.charAt(j),1);


            while(mp.size()<j-i+1) {
                mp.replace(s.charAt(i),mp.get(s.charAt(i))-1);
                if(mp.get(s.charAt(i))==0){
                    mp.remove(s.charAt(i));
                }
                i++;
            }



            if(mp.size()==j-i+1){
                maxi=Math.max(j-i+1,maxi);

            }


            j++;
        }
        return maxi;
    }
}
