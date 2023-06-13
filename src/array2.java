import java.util.Scanner;
import java.util.Arrays;
public class array2 {
    public static void main(String args[])
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values to enter in array");
        int a = sc.nextInt();
        int[] array = new int[a];
        for(int i = 0 ; i<a ; i++)
        {
            array[i] = sc.nextInt();
        }

        for(int i=0 ; i<a ; i++)
        {
            sum = sum + array[i] ;
        }
        System.out.println("the sum of array is : " + sum);
        sc.close();
    }
    
}
