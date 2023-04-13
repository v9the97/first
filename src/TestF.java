import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestF {
    public static void main(String[] args)
    {
        int arr[] = { 100,14, 46, 47, 100, 94, 94, 52, 86, 36, 94, 89 };


        //Integer  []a=new Integer[5];

       // Integer  arr[] = { 100,14, 46, 47, 100, 94, 94, 52, 86, 36, 94, 89 };

        //List<Integer> list1 = Arrays.asList(arr);


        //List<Integer> list= Arrays.asList(a);


       // List<Integer> list1=Arrays.asList(arr);

        //list1.remove(1);
        Arrays.sort(arr);

            int l=arr.length;

        System.out.println("Second largest value "+arr[l-1]);

        Optional<Integer> op=Arrays.stream(arr).mapToObj((e)->Integer.valueOf(e))
                          .sorted(Comparator.reverseOrder()).distinct()
                              .skip(1).findFirst();




        System.out.println(op.get());


    }
}