import java.util.Scanner;

public class WeekDayName

{
	public static void main( String[] args )
	{
	    Scanner input=new Scanner(System.in);
	    int a;
	    
	    System.out.print( "Enter the number of the weekday: " );
        a=input.nextInt();
        
		if ( a==1)
		{
			System.out.println( "Weekday 1: Sunday" );
		}
		else if ( a==2 )
		{
			System.out.println( "Weekday 2: Monday" );
		}
		else if ( a==3)
		{
			System.out.println( "Weekday 3: Tuesday" );
		}
         

		else if ( a==4 )
		{
			System.out.println( "Weekday 4: Wednesday" );
		}
		else if ( a==5 )
		{
			System.out.println( "Weekday 5: Thursday" );
		}
		else if ( a==6)
		{
			System.out.println( "Weekday 6: Friday" );
		}


		else if ( a==7 )
		{
			System.out.println( "Weekday 7: Saturday" );
		}
		else if ( a==0 )
		{
			System.out.println( "Weekday 0: Saturday" );
		}

		else
		{
		   System.out.print( "Weekday ");
		   System.out.println( a +": error" );
		  }
	}
}