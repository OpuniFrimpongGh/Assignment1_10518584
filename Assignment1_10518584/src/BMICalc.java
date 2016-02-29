import java.util.Scanner;

public class BMICalc
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double height,weight,bmi,height1,weight1,bmi1;
        double height2,height3,weight2, bmi2, heightsum;
        
        System.out.print("Enter your height in metres: ");
        height=input.nextDouble();
        
        System.out.print("Enter your weight in kilograms: ");
        weight=input.nextDouble();
        
        bmi=weight/(height*height);
        
        System.out.println("Your BMI is "+ bmi);
        System.out.println();
        
       System.out.print("Enter your height in inches: ");
        height1=input.nextDouble();
        height1=(height1*0.0254);
        
        System.out.print("Enter your weight in pounds: ");
        weight1=input.nextDouble();
        weight1=(weight1*0.453592);
        
        bmi1=(weight1)/(height1*height1);
        
        
        System.out.println("Your BMI is "+ bmi1);
        System.out.println();
        
        System.out.print("Enter your height in (feet only): ");
        height2=input.nextDouble();
        height2=(height2*0.3048);
        System.out.print("Enter your height in (inches): ");
        height3=input.nextDouble();
        height3=(height3*0.0254);
        heightsum=height2+height3;
        
        System.out.print("Enter your weight in pounds: ");
        weight2=input.nextDouble();
        weight2=(weight2*0.453592);

        
        bmi2=(weight2)/(heightsum*heightsum);
        
        System.out.println("Your BMI is "+ bmi2);
    }
}

 