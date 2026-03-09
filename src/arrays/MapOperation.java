package arrays;
import java.util.*;
import java .lang.*;

public class MapOperation {
    public static void main(String [] args){
        String str="ankitkumarrajavat";
        Map<Character,Integer> map=new HashMap<>();

        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        map.forEach((k,v)-> System.out.print(k+" "+v));
        for(Map.Entry<Character,Integer>mp:map.entrySet()){
            System.out.println(mp.getKey()+" " +mp.getValue());

        }
        System.out.println(map.size());
       // map.put(ch[i],map.getOrDefault(ch[i],0)+1);
//        char [] ch=str.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            if(map.containsKey(ch[i])){
//
//                map.put(ch[i],map.get(ch[i])+1);
//            }
//            else {
//                map.put(ch[i],1);
//            }
//        }


        }

    }

