import java.util.stream.IntStream;

public class RangePN {

    private static boolean isprime(int number)
    {
        return IntStream.rangeClosed(2,number/2).noneMatch(i->number%i>0);

    }

    public  static void main(String args[])
    {
        int number=16;
      if(isprime(number))
      {
          System.out.println("prime");
      }
      else {
          System.out.println("not prime "+number);
      }

    }

}
