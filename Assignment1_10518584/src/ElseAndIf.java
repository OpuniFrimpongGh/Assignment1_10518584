public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
		else if ( cars < people )
		{
			System.out.println( "We should not take the cars." );
		}
		/*else
		{
			System.out.println( "We can't decide." );
		}
          */

		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
}

/* 1. else if executes the statement if the condition(s) is true 
 *and else executes the statement if the condition(s) is false 
 */ 

/* 2. It changes nothing in the output because, here is the case 
 * the else would be executed when the values of the variable are 
 * equal but the are not
 */