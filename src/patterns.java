public class patterns {
    public static void main(String args[])
    {
        int a = 8;
          for(int i=0 ; i<a ; i++)
          {

            for(int j=0 ; j<a ; j++)
            {
                if(i==0 || j ==0 || i==a-1 || j==a-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
          }
        

       

       
    }
    
}
