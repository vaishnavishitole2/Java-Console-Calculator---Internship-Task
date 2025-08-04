package DAY1;
import java.util.*;
public class Calculator 
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        boolean a = true ;

        while (a)
        {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.println("Select a Option");
            int s = sc.nextInt();

            double res = 0;
              double a1 = 0;
              double a2 =0 ;
            if (s != 5)
            {
                System.out.println("Enter a first number");
            a1 = sc.nextDouble();

            System.out.println("Enter a Second number");
            a2 = sc.nextDouble();   
            }
             
             switch (s) {
                case 1: 
                {
                    res = add(a1 , a2);
                     break;
                }
                case 2: 
                {
                    res = sub(a1 , a2);
                     break;
                }
                case 3: 
                {
                    res = mul(a1 , a2);
                     break;
                }
                case 4: 
                {
                    res = div(a1 , a2);
                     break;
                }  
                case 5 :
                {
                    System.out.println("!...EXIT Successfully...!");
    
                    a = false; 

                    break;
                }
                default:
                {
                     System.out.println("Enter a Option");
                     break;
                }
             
            }
             System.out.println("Result : "+ res);
        }
    }
        public static double add(double num1  , double num2)
        {
            return num1 + num2 ;
        }
         public static double sub(double num1 , double num2)
        {
            return num1 - num2 ;
        }
         public static double mul(double num1 , double num2)
        {
            return num1 * num2 ;
        }
         public static double div(double num1 , double num2)
        {
            return num1 / num2 ;
        }
}
