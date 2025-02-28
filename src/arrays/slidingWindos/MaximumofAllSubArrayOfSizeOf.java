package arrays.slidingWindos;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MaximumofAllSubArrayOfSizeOf {
    public static void main(String[] args) {
        int []arr={1,-1,3,-1,5,6,1,7,-2};
        List<Integer> list=findMaximum(arr,3);
        System.out.println(list);
    }

    private static List<Integer> findMaximum(int[] arr, int k) {
        int i=0;
        int j=0;
        Queue<Integer>queue=new ArrayDeque<>();
        List<Integer>answer=new ArrayList<>();
        while(j<arr.length){

           while(!queue.isEmpty() && queue.peek()<=arr[j]){
               queue.poll();
           }

           queue.add(arr[j]);
         if(j-i+1==k){
                answer.add(queue.peek());
                if(arr[i]==queue.peek() && queue.size()>1){
                    queue.poll();
                }
                i++;
                j++;
            }
          if(j-i+1<k){
              j++;}

        }
        return answer;
    }

}
