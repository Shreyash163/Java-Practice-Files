import java.util.Scanner;

public class first {
    public static void main (String args[] )
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt(); 
        System.out.print(a);
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if(a == b && b == c && c == d)
        {
          System.out.println("numbers are equal");
        }
        else
        {
            System.out.println("number are not equal");
        }
    }
    
}
