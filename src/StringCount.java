import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCount {

    public static void main(String []args)
    {
        String s="vinod is now now is final is";

        String rs="vinodnew";

        List<String> list =Arrays.asList(s.split(" "));

      Map<String ,Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

       Map<Character,Long> m=rs.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->(char) c,Collectors.counting()));
        System.out.println(m);

    }

}
