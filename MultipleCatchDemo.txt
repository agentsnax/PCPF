import java.util.*;
class MultipleCatchDemo
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		int i,n;

		System.out.print("Enter the number: ");

		String s=sc.next();

		try{ 	n=Integer.parseInt(s);

			int a[] = new int[n];

			System.out.print("Enter index to store value :");

			i=sc.nextInt();

			a[i]=100;

		}

		catch (NumberFormatException e)

		{ 
		System.out.println("input is wrong...");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			 System.out.println("can not store the value ....");

		}

		catch(Exception e) 
		{

		System.out.println("some unknown error occured....");

		}
		finally
		{ 
		System.out.println("Program terminated...");
		}
	}
}