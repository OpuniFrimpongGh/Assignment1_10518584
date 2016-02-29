import java.util.Scanner;

public class SpaceBoxing
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double weight;
        int planet;
        double Venus=0.78,Mars=0.39, Jupiter=2.65,Saturn=1.17, Uranus=1.05, Neptune=1.23 ;
        
        System.out.println("What's your weight on earth?");
        weight=input.nextDouble();
        System.out.println();
        
        System.out.println("I have information on the folowing planets: ");
        System.out.println("1. Venus\t2. Mars\t\t3. Jupiter\t");
        System.out.println("4. Saturn\t5. Uranus\t6. Neptune\t");
        System.out.println();
        
        System.out.println("Which planet are you visiting?");
        planet=input.nextInt();
        System.out.println();
        
        if (planet==1)
        {
          System.out.println("Your weight would be " + (weight*Venus) + " pounds on that planet");
        }
        
        else if(planet==2)
        {
          System.out.println("Your weight would be " + (weight*Mars) + " pounds on that planet");
        }

        else if(planet==3)
        {
          System.out.println("Your weight would be " + (weight*Jupiter) + " pounds on that planet");
        }
 
        else if(planet==4)
        {
          System.out.println("Your weight would be " + (weight*Saturn) + " pounds on that planet");
        } 
        
        else if(planet==5)
        {
          System.out.println("Your weight would be " + (weight*Uranus) + " pounds on that planet");
        }
        
        else if(planet==6)
        {
          System.out.println("Your weight would be " + (weight*Neptune) + " pounds on that planet.");
        }
    }
}