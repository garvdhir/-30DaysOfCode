package Basic_Programming;

public class LeapYear 
{ 
    public static void main(String[] args) 
    {
        int n=2016;
        if((n%400==0) || (n%4==0 && n%100!=0))
          {
             System.out.println("n is a leap year");
          }     
         else
         {
              System.out.println("n is not a leap year");      
         }
        
    }
    
}
