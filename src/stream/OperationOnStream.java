package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OperationOnStream {
public static void main(String[] args) {

    List<Integer>arrayList=  List.of(1,2,3,3,4,6,6);
    int sum=arrayList.stream().mapToInt(Integer::intValue).sum();
    //System.out.println(sum);

    long length=arrayList.stream().mapToInt(Integer::intValue).count();
    //System.out.println(length);

    List<String>list=List.of("ankit","sumit","amit");
    list.stream().map(String::length).forEach(System.out::println);



}

}
