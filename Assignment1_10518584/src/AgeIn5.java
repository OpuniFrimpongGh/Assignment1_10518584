import java.util.Scanner;

public  class AgeIn5
{
   public static void main(String[] args)
   {
    Scanner input = new Scanner(System.in);
    
    String name;
    int age;
    
    System.out.println("Hey, what's your name?");
    name = input.next();
    
    System.out.println("What's up, " + name + "! How old are you?");
    age = input.nextInt();
    
    System.out.println("Wow! Then, in five years time, you'll be "+ (age+5) + " years");
    System.out.println("And five years ago, you were " + (age-5)+ " years");
   
     }
}
