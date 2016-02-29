import java.util.Scanner;

public  class NameAgeAndSalary
{
   public static void main(String[] args)
   {
    Scanner input = new Scanner(System.in);
    
    String name;
    int age;
    double sal;
    
    System.out.println("Good Morning, what's your name?");
    name = input.next();
    
    System.out.println("What's up, " + name + "! How old are you?");
    age = input.nextInt();
    
    System.out.println("Wow! " + age + " years? I thought you'd be older than that...hehe");
    System.out.println("So how much do you earn in a day?");
    sal=input.nextDouble();
    
    System.out.println("GHS " + sal + " a day is cool!");
    
     }
}