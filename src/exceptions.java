import java.io.*;

public class exceptions {
    public static void main(String args[])
    {
        
        try{
            int result = divide(5,0);
            System.out.print(result);
        }
        catch(ArithmeticException e)
        {
            System.out.print(e.getMessage());
        }
        
    }

    public static int divide (int dividend ,int divisor)
    {
        if(divisor == 0)
        {
            throw new ArithmeticException("cannot divide by 0 !");

        }
        return(dividend/divisor) ;
    }
}