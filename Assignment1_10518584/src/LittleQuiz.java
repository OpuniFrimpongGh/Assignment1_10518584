import java.util.Scanner;

public class LittleQuiz
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int q1,q2,q3;
        int kount=0;
        
        
        System.out.print("Are you ready for a Quiz?");
        input.next();
        System.out.println("Okay, here it comes!");
        System.out.println();
       
 
        System.out.println("Q1) What is the capital of Ghana?");
	    System.out.println("\t1) Bolgatanga");
	    System.out.println("\t2) Ho");
	    System.out.println("\t3) Accra");
	    q1=input.nextInt();
	    
	    if (q1==3)
	    {
	       System.out.println("Correct Answer");
	       kount+=1;
	       }
	       
	     else
	     {
	        System.out.println("Wrong Attempt");
	        kount=kount;
	       }
        System.out.println();



        System.out.print("Q2) Can you store the value ");
        System.out.print("\"cat\"");
        System.out.println(" in a variable of type int?");
	    System.out.println("\t1) Yes");
	    System.out.println("\t2) No");
	    q2=input.nextInt();
	    
	    if (q2==2)
	    {
	       System.out.println("Correct Answer");
	       kount+=1;
	   }
	       
	     else
	     {
	        System.out.println("Wrong Attempt");
	        kount=kount;
	       }
	       System.out.println();

	    System.out.println("Q3) What is the result of 6+8*5?");
	    System.out.println("\t1) 5");
	    System.out.println("\t2) 11");
	    System.out.println("\t3) 43");
	    q1=input.nextInt();
	    
	    if (q1==3)
	    {
	       System.out.println("Correct Answer");
	       kount+=1;
	       }
	       
	     else
	     {
	        System.out.println("Wrong Attempt");
	        kount=kount;
	       }
	       System.out.println();
	       
	    System.out.println("Overall, you got "+ kount+ " out of 3 correct");
	    System.out.println("Goodbye and Thanks for Playing");
    }
}