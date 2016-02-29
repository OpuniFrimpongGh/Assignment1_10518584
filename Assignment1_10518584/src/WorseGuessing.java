import java.util.Scanner;

public class WorseGuessing
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double a=1.2, guess;
        
        
        System.out.println("NOW LET'S PLAY THE GUESSING GAME!!!\n");
        
        System.out.println("THINK OF ANY NUMBER FROM 1-10, GUESS AND ENTER WHAT YOU THINK");
        guess=input.nextDouble();
        System.out.println();
        
        if(guess==a)
        {
            System.out.println("YOU GOT IT! GREAT JOB!");
        }
        
        else
        {
            System.out.println("AWW, BETTER LUCK NEXT TIME!");
            System.out.println();
            System.out.println("THE SECRET NUMBER IS " + a );
        }
    }
}