import java.lang.reflect.Array;

public class recurname {

    public static void name ( int[] arr , int i, int temp )
    {
        temp = arr[i];
        arr[i] = arr[(arr.length)-(i+1)] ;
        arr[(arr.length)-(i+1)] = temp;
        i++;
      if(i>4)
       {
       return ;
        
       }
       name(arr, i, temp);
        
        
    }

    public static void Print( int [] arr )
    {
        for(int j =0 ; j<5 ; j++)
        {
            System.out.print(arr[j]);
        }
    }
    public static void main(String args[])
    {
        int []arr =  {1,2,3,4,5} ;
        int i = 0;
        int temp = 0 ;
        name( arr , i , temp);
        Print(arr);
    }

   
}
