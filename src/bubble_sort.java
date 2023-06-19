public class bubble_sort {
        public static void main(String args[])
        {   int temp;
           
            int[] arr = { 4,-2 ,54 , 23 ,1 , -5, 0};
           
           for(int j = 0 ; j<6 ; j++)
           {
            for(int i = 0 ; i<6 ; i ++ )
            {
                if (arr[i] > arr[i+1])
                {   
                    
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp ; 
                }
            }
            }
             for(int i = 0 ; i< 7 ; i++)
        {
             System.out.print( arr[i]+ " ");
        }
        }
}
