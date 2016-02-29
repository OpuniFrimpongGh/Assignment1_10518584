import java.util.Scanner;

public class ForgetfulMachine
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Where do you stay?");
    input.next();
    System.out.println();
    
    System.out.println("What is your relationship status?");
    input.next();
    System.out.println();
    
    System.out.println("What's your phone number?");
    input.nextInt();
    System.out.println();
    
    System.out.println("What's your pin?");
    input.nextInt();
    System.out.println();
    
    System.out.println("Now, that's all I need from you. Thank you!");
    }


}