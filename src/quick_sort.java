import java.util.Arrays;

public class quick_sort 
{
   
    public static void main( String args[])
    {
        int [] arr = {7, 1, 9 ,2 ,0,4,6};
        int n = arr.length;
        int low = 0 ;
        int high = n-1 ;
        sort(arr,low , high);
         System.out.print(Arrays.toString(arr)); 

    }
    public static int partition(int [] arr , int low , int high)
    {
        int pivot = arr[high];
        int i = low -1 ;
       
        for(int j = low ; j<high ; j++)
        {
          if(arr[j]<pivot)
          {
            i++;
           int temp = arr[j];
            arr[j] = arr[i];
            arr[i]= temp;
          }

        }
        i++ ;  //this code is giving pivot a place after all the elements smaller than pivot are place in sorted manner
       int temp = arr[high];
        arr[high]=arr[i];
        arr[i]=temp;
        return i ;
    }

    private static void sort(int[] arr, int low , int high)
    {  
             if(low<high)
             {
                int pidx = partition(arr , low , high);
                sort(arr , low , pidx-1);
                sort(arr, pidx+1 , high);

             }
    }

        
    

}