package stream;

import java.util.List;

public class ListOfStringToUpperCase {
    public static void main(String[] args) {

       // List<String>str=List.of("ankit","amit","sumit");
        List<String>str=List.of("ANKIT","AMIT","SUMIT");
        //List<String>ans=str.stream().map(x->x.toUpperCase()).toList();
        List<String>ans=str.stream().map(x->x.toLowerCase()).toList();
        System.out.println(ans);
    }
}
