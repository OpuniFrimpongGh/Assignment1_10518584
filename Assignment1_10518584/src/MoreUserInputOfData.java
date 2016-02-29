import java.util.Scanner;

public class MoreUserInputOfData
{
  public static void main(String[] args)
   {
    Scanner input = new Scanner(System.in);
    
   String fname,lname,lgn;
   int grd,id;
   double gpa;
    
    System.out.println("Hello, please provide me with the following details!\n");
    
    System.out.print("Enter your first name: ");
    fname=input.nextLine();
    
    System.out.print("Enter your last name: ");
    lname=input.nextLine();
    
    System.out.println("Which grade(1-12) are you?");
    grd=input.nextInt();
    
    System.out.print("Enter your Student ID: ");
    id=input.nextInt();
    
    System.out.println("What's your login name?");
    lgn=input.next();
    
    System.out.println("Whare does your GPA(0.0-4.0) now?");
    gpa=input.nextDouble();
    System.out.println();
    
    System.out.println("Below are your details:");
    System.out.println("               Full Name: " + lname + "," + fname);
    System.out.println("               Student ID: "+ id);
    System.out.println("               Login: " + lgn );
    System.out.println("               Grade: " + grd);
    System.out.println("               GPA: " + gpa);
    }

}