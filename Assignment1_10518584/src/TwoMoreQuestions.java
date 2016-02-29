import java.util.Scanner;

public class TwoMoreQuestions
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String q1="inside", q3="outside", q5="both";
                String q2="no",q4="yes", q6="both";
        
        
        System.out.println("TWO MORE QUESTIONS, BABY");
        System.out.println();
        System.out.println("Now, think of something and I'll "
                + "try to guess it");
        System.out.println();
        
        System.out.println("Question 1) Does it stay inside "
                + "or outside or both?");
        q1=q3=q5=input.next();
        
        System.out.println("Question 2) Is it a living thing?");
        q2=q4=q6=input.next();
        
        if(q1=="inside" && q4=="yes" )
        {
          System.out.println("Wow, then I guess you're thinking of a virus");  
        }
        
        if(q1=="inside" && q2=="no")
        {
          System.out.println("Wow, then I guess you're thinking of a blood");  
        }
                
        if(q3=="outside" && q4=="yes" )
        {
          System.out.println("Wow, then I guess you're thinking of a lion");  
        }
            
        if(q3=="outside" && q2=="no" )    
        {
          System.out.println("Wow, then I guess you're thinking of a gravels");  
        }
        if(q5=="both" && q2=="yes" )
          {
          System.out.println("Wow, then I guess you're thinking of a cat");  
        }
            
        if(q5=="both" && q6=="no" ) 
           {
          System.out.println("Wow, then I guess you're thinking of a laptop");  
        }
    }
 }