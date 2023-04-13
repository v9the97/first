import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void
    main(String []args)
    {
        List<Integer> list= Arrays.asList(1,2,3,2,1,4,5,6,4,5,6,10);

        Set<Integer> set=new HashSet<>();

       List<Integer> duplicate= list.stream()
               .filter(e->!set.add(e)).collect(Collectors.toList());

       duplicate=list.stream().distinct().collect(Collectors.toList());

       for(Integer i:duplicate)
       {
           System.out.println("Duplicate element "+i);
       }

    }


}
