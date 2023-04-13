import java.util.Optional;

public class OptionalTest {
    public static void main(String[] a)
    {
        String str="ffgdfg";
        str=null;

        Optional<String> optional=Optional.ofNullable(str);
        System.out.println(optional);



    }

}
