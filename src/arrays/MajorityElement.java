package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

        private static int majorityElement(int[] nums) {
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);}
                else
                    map.put(nums[i],1);
            }
            int maxi=Integer.MIN_VALUE;
            int result = 0;
            for(Map.Entry<Integer,Integer>mp :map.entrySet()){
                if(mp.getValue()>maxi){
                    maxi=mp.getValue();
                    result=mp.getKey();
                }
            }
            return result;
        }

 public static void main(String[] args){
            int [] arr={2,2,3,3,3,4};

     System.out.println(majorityElement(arr));
 }
        }
