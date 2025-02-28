package arrays.slidingWindos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurenceOfAnagramsInString {
    public static void main(String[] args) {
        String str="aabaabababb";
        String  str1="aaba";
        List<Integer>list=countAnagrams(str,str1);
        System.out.println(list);
    }

    private static List<Integer> countAnagrams(String str, String str1) {
        List<Integer> ans = new ArrayList<>();
        if (str.length() < str1.length()) return ans;

        int k = str1.length();
        Map<Character, Integer> map = new HashMap<>();

        // Fill the frequency map for str1
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int count = map.size(); // Unique characters count
        int i = 0, j = 0;

        while (j < str.length()) {
            // Decrease frequency if character exists in the map
            if (map.containsKey(str.charAt(j))) {
                map.put(str.charAt(j), map.get(str.charAt(j)) - 1);
                if (map.get(str.charAt(j)) == 0) count--;
            }

            // Expand window until it reaches the desired size
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                // If count == 0, we found an anagram
                if (count == 0) ans.add(i);

                // Slide the window: Restore the count of the character going out
                if (map.containsKey(str.charAt(i))) {
                    if (map.get(str.charAt(i)) == 0) count++;
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                }

                i++;
                j++;
            }
        }
        return ans;
    }
}
