import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

   public static void main(String[] args)
   {
     //  List=1,2,3,2,1
 int a[]={1, 2, 3};

       Integer []i={1,2,3,1,2};

       List<Integer> ij= Arrays.asList(i);

       Arrays.stream(a).mapToObj(e->Integer.valueOf(e)).sorted(Comparator.reverseOrder()).findFirst();

       ij.stream().distinct().collect(Collectors.toList());

       System.out.println(ij.stream().distinct().collect(Collectors.toList()));

       //HahMap<Integer,Integer> map=new HashMap<>();




   }

    }
