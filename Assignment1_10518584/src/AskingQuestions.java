import java.util.Scanner;

public  class AskingQuestions
{
   public static void main(String[] args)
   {
    Scanner input = new Scanner(System.in);
    
    int age;
    String height; 
    double weight;
    
    System.out.print("How old are you?\n ");
    age = input.nextInt();
    
    System.out.print("How tall are you?\n");
    height = input.next();
    
    System.out.print("How much do you weigh?\n");
    weight = input.nextDouble();
    
    System.out.println ("So you are " + age + " years old, " + height +"' tall and "+ weight + " heavy ");
    
    }

}