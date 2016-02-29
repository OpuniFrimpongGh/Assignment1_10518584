import java.util.Scanner;

public class HowOldAreYou
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String name;
        int age;
        
        System.out.println("Hey, what's your name?");
        name=input.nextLine();
        
        System.out.println("What's up, " + name + ", how old are you?");
        age=input.nextInt();
        System.out.println();
        
        if (age<16)
        {
           System.out.println("You can't drive, "+name+"."  );
           System.out.println("You can't vote, "+ name+"." );
        }
        
        if (age<18 && age>16)
        {
           System.out.println("You can't vote, "+ name+"." );
        }
        
        if(age<25)
        {
           System.out.println("You can't rent a car, "+ name+"." );
        }
        
        if(age>25)
         {
           System.out.println("You can do anything that's legal, "+ name+"." );

        }
    }
}