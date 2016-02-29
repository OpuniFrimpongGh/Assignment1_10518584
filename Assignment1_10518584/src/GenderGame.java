import java.util.Scanner;

public class GenderGame
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        String fname,lname,gender,ans;
        int age;
        String  F="0",M="1",y="1",n="0";
        
        System.out.print("What is your gender(M or F): ");
        gender=input.next();
        
        System.out.print("First name: ");
        fname=input.next();
        
        System.out.print("Last name: ");
        lname=input.next();
        
        System.out.print("Age: ");
        age=input.nextInt();
        
        if (gender==F && age>=20)
          {
                System.out.print("Are you married, " + fname +"(y or n)?");
                ans=input.next();
                
                if(ans==y)
                {
                     System.out.println("Then I shall call you Mrs. "+ lname);
                }
                else
                {
                     System.out.println("Then I shall call you Ms. "+ lname);
                }
            }
         else if(gender==F && age<20)
           {
                  System.out.println("Then I shall call you "+ fname + lname);
           }
         
         
         if (gender==M && age>=20)
            {
                      System.out.println("Then I shall call you Mr. "+ lname);
            }
         else if(gender==M && age<20)
            {
                 System.out.println("Then I shall call you "+ fname + lname);
            }
    }
}