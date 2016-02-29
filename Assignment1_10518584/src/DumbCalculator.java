import java.util.Scanner;

public class DumbCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double x,y,z,calc;
        
        System.out.print("Enter your 1st number: ");
        x=input.nextDouble();
        
        System.out.print("Enter your 2nd number: ");
        y=input.nextDouble();
        
        System.out.print("Enter your 3rd number: ");
        z=input.nextDouble();
        
        calc=(x+y+z)/2;
        
        System.out.println( "( "+x+" + "+y+" + "+z+" )"+" / 2 is... " + calc);
    }
}