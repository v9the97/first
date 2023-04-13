import java.util.*;

public class Unique {

    public static void main(String []args)
    {

        List<Integer> a= Arrays.asList(1,2,3,4);

        List<Integer> b=Arrays.asList(1,2,5,4,3,7,8);

        HashSet<Integer> hashSet=new HashSet<>(a);

        hashSet.addAll(b);

        System.out.println(hashSet);



    }
}
