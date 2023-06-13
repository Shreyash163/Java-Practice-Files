public class patterns {
    public static void main(String args[])
    {
        int a ;
        for(int i = 0 ; i<5 ; i++)
        {

            
            System.out.println("");
            
            for(int k = 0 ;k<5-i-1;k++)
            {
                System.out.print(" ");
            }
            
            for(int j=0 ; j<(2*i + 1)  ;j++)
            {
                System.out.print("*");
                }
            for(int k = 0 ;k<5-i+1;k++)
            {
                System.out.print(" ");
            }
        }

        for(int i = 5 ; i>0 ; i--)
        {

            
            System.out.println("");
            
            for(int k = 0 ;k<5-i+1;k++)
            {
                System.out.print(" ");
            }
            
            for(int j=0 ; j<(2*i - 1)  ;j++)
            {
                System.out.print("*");
                }
            for(int k = 0 ;k<5-i+1;k++)
            {
                System.out.print(" ");
            }
            
        }
    }
    
}
