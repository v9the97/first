import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args)
    {

        int jk,ir,nm=5,ls=0;

        for(ir=nm/2;ir>1;ir--)
        {
            if(nm%ir>0)
            {
                ls=0;
                }
            else
            {
                ls=1;
                break;
            }
        }
        if(ls==0) {
            System.out.println("prime " + nm);
        }
        int i,j,k=0,n=50;
List<Integer> a= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

       // System.out.println(5%2);

        for(i=1;i<a.size();i++)
        {
            for(j=a.get(i)/2;j>1;j--)
            {
              //  int rst=a.get(i)%a.get(j);
               // System.out.println("gettt "+a.get(i)%a.get(j));
                int r=a.get(i);
                int s=a.get(j);
                if(r%j>0)
                {
                    k=0;
                   // System.out.println("in real "+a.get(i));
                }
                else
                {
                    k=1;
                    break;
                }
            }
            if(k==0) {
                System.out.println("number is " + a.get(i));
                k = 1;
            }
        }

    }


}
