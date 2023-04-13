// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class NewTest{
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //arr = 1,2,1,2,3,4

        int i=5,j=0;
        Integer k;
        int input[]=new int[6];
        input[0]=1;
        input[1]=2;
        input[2]=3;
        input[3]=1;
        input[4]=2;
        input[5]=4;

        char a='B';
        char b='b';
   int kr;
    kr=Character.getNumericValue(a);
  // kr=Integer.parseInt(String.valueOf(a));
        System.out.println(Character.getNumericValue(a)+" A "+Character.getNumericValue(b)
  );

        Integer ij=128;
        Integer ijk=128;

        Integer big=129;
        Integer biga=129;

        if(ij==ijk)
            System.out.println(true);
        else {
            System.out.println("not eqal");
        }
        if(big==biga)
        {
            System.out.println(" true value is "+big);
        }
        else {
            System.out.println(false);
        }

       /* HashMap<Integer,Integer> map=new HashMap<>();

        for(i=0;i<input.length;i++)
        {

            if(map.containsKey(input[i]))
            {
                map.put(input[i], map.get(input[i])+1);
            }
            else
            {
                map.put(input[i], 1);
            }
        }

        System.out.println(map);
*/
    }
}