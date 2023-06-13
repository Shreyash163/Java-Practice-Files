import  java.util.Scanner;
public class array {
    public static void main (String args[])
    {
      
       
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        String [] arr = new String [a];
        System.out.print("enter the Elements of array");
        for(int i =0 ; i<a;i++)
        {
            arr[i] = sc.next();
        }
        System.out.print("elements of array are : ");
        for(String element : arr)
        {
            System.out.println(element);
        }
         
        sc.close();
    }
    
}
