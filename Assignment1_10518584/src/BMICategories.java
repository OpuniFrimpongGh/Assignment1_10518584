import java.util.Scanner;

public class BMICategories
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double height,weight,bmi;
        
        System.out.print("Enter your height in metres: ");
        height=input.nextDouble();
        
        System.out.print("Enter your weight in kilograms: ");
        weight=input.nextDouble();
        System.out.println();
        
        bmi=weight/(height*height);
        
        System.out.println("Your BMI is "+ bmi);
        
        if(bmi<18.5)
        {
           System.out.println("BMI Category: Underweight"); 
        }
        else if (bmi>=18.5 && bmi<25)
        {
            System.out.println("BMI Category: Normal Weight");    
        }
        else if (bmi>=25 && bmi<30)
        {
            System.out.println("BMI Category: Overweight");    
        }
        else if (bmi>=30)
        {
            System.out.println("BMI Category: Obese");    
        }
    }
}