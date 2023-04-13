import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface First{
    void add(int a,int b);
}
interface Prime{
    List<Integer> primecheck(List<Integer> a);
}

public class Lambda {
    public static void main(String [] args)
    {
        First first=(a,b)->{
            int r;
        System.out.println(r=a+b);
            System.out.println("success");
           // return r;
        };

        Prime prime=(List<Integer> p)->{
          int i,j,k=0;
          List<Integer> returnPrime= new ArrayList<Integer>();
          for(i=0;i<p.size();i++)
          {
              for(j=p.get(i)/2;j>=2;j--)
              {
                  if(p.get(i)%j>0)
                  {
                      k=1;
                  }
                  else {
                      k=0;
                      break;
                  }
              }
              if(k==1)
              {
                  returnPrime.add(p.get(i));
              }
          }
           return returnPrime;
        };


        Lambda lambda=new Lambda();

        //
        first.add(5,6);
        List<Integer> check= Arrays.asList(19,2,3,4,5,6,7,8,9,10,11,55,77,53,18);

        List<Integer> finalprime=prime.primecheck(check);

        for(Integer i:finalprime) {
            System.out.println("prime number " +i);
        }
    }

}
