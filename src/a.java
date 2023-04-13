import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class a {

    public static void main(String []args)
    {
        String s[]=new String[4];
               // String r="Vinod";

        s[0]="vinod";
        s[1]="vijay";
        s[2]="vinod";
        List<String >sr= Arrays.asList(s);

        HashSet<String> hashSet=new HashSet<>();

       Set<String> fina= sr.stream().filter(e->!(hashSet.add(e))).collect(Collectors.toSet());

        System.out.println(fina);

        List<String> ab=Arrays.asList("a","b","z","i","c");


        List<String> cd=  ab.stream().sorted().collect(Collectors.toList());
        System.out.println(cd);
    }
}
