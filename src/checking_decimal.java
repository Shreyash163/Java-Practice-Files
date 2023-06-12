import java.util.Scanner;

public class checking_decimal {
    public static void main (String args[])
    {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the decimals to be checked");
    double a = sc.nextDouble();
    double b = sc.nextDouble();

    if(0<a && 0<b && a<1 && b<1)
    {
        System.out.println("the numbers entered are greater than 0 and less than 1");
    }
    else {
        System.out.println("numbers are out of bounds");
    }
    } 
}
