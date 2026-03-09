package stream;

import java.util.List;

public class CountOfA {
    public static void main(String[] args) {
        List<String>str=List.of("amit","ankit","sumit");

        long ans=str.stream().filter(x->x.startsWith("a")).count();
        System.out.println(ans);
    }
}
