package Basic_Programming;

public class Cal 
{
    public static void main(String[] args) 
    {
        int no1=10,no2=20,res;
        String symbol="*";
        switch(symbol)
        {
            case"+":res=no1+no2;
                System.out.println(res);
                break;
            case"-":res=no1-no2;
                System.out.println(res);
                break;
            case"*":res=no1*no2;
                System.out.println(res);
            case"/":res=no1/no2;
                System.out.println(res);
            default:System.out.println("invalid symbol");
            break;
            }
        }     
    }
    

