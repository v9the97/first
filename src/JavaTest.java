import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class JavaTest {

    public static void main(String[] args)
    {
        List<Character> list= Arrays.asList('a','b',null,'c','d',null);


        Set <Integer> set=new HashSet<>();

       List<Character> list1= list.stream().filter(e->e!=null).collect(Collectors.toList());
       Character r='g';
       String rs="rishi";

       String []rs1=new String[3];
       rs1[0]="vinod";
       rs1[1]="rrr";
       rs1[2]="sddsfs";

       StringBuffer stringBuffer=new StringBuffer("Rishi");
List rst=Arrays.asList("vinod ","Rh");

//rst.stream().map((String e, String st)-> MethodRef::two));

 //rst.forEach(s -> MethodRef.add(s));

        String []v=new String[5];
        v[0]="vinod";
        v[1]="sona";
        v[2]="Jinnu";

        Optional<String[]> optional=Optional.ofNullable(v);
       List<String> l=Arrays.asList(v);
     List<StringBuffer>rtt=  l.stream().map(word->new StringBuffer(word).reverse()).collect(Collectors.toList());
       //  List<StringBuffer> rtt=  Stream.of(v).map(word->new StringBuffer(word).reverse()).collect(Collectors.toList());

        System.out.println(rtt
        );
        //System.out.println();
        //rst.forEach(name-> System.out.println());


 //rst.forEach(StringUtils::reverse);
 //rst.stream().map(StringUtils::(String)trimWhitespace).collect(Collectors.toList());
       // List<StringBuffer> ss= rst.stream().map(StringUtils::reverse).forEach(System.out::print);

       //  List<StringBuffer> ss= Stream.of(stringBuffer).map(stringBuffer::toString).collect(Collectors.toList());



       // System.out.println("First "+ss);

        List<String> list2=Arrays.asList("a","b","c","a","b","z","a");

        HashMap<String,Integer> hashMap=new HashMap<>();

        for(String rt:list2)
        {
            if(hashMap.containsKey(rt))
            {
                hashMap.put(rt,hashMap.get(rt)+1);
            }
            else {
                hashMap.put(rt,1);
            }
        }
    }


}

