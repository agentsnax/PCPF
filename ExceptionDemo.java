import java.util.*;

class ExceptionDemo

{

	public static float divide(float n, float d) throws Exception 
	{ 
		if(d == 0.0f)

			throw new Exception();

		return(n/d);

	} 
	public static void main(String[] args)

	{ 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Input x : ");
		float x = sc.nextFloat();

		System.out.print("Input y: ");
		float y = sc.nextFloat();

		try

		{  
			System.out.println("Division = "+divide(x,y));

		} 

		catch(Exception e)

		{ 
			System.out.println("Division NOT possible..");

		}

	}

}