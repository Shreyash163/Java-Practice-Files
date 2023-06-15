public class Selection_sort {
    
    public static void main(String args[])
    {
        int a , b , temp = 0, final_min;
        int[] array = {4,1,7,3,8,2};
        for(int i = 0 ; i<5; i++)
        {
             a = array[i];
             b= 0;
             for (int j = i+1 ; j<6; j++)
             {
                if (array[j]<a)
                {
                    a = j;
                    
                }
                
                
             }
             
                temp = array[a];
                array[a] = array[i];
                array[i]= temp;
                
            
             

        }

        for(int i = 0 ; i< 6 ; i++)
        {
             System.out.print( array[i]);
        }
    }
}
