import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=100;
		int b=0;
		int c=a/b;
		Scanner s=new Scanner(System.in);
		
		try {
			System.out.println("Enter a integer");
			b=s.nextInt();
			c=a/b;
		}
		catch(ArithmeticException ar)
		{
			System.out.println("Cant divide by zero "+ar);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter integer "+e);
		}
		finally 
		{
			System.out.println(+a+" "+b);
		}
		
		*/
		try
		{
			Studnt st1=new Studnt();
		}
		catch (nameExcpetion e)
		{
			System.out.println(e.getMessage());
		}
		catch (ageException e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}

class Studnt
{
	int age;
	String firstName;
	String middleName;
	String lastName;
	Scanner s=new Scanner(System.in);
	boolean status;
	
	public Studnt() throws nameExcpetion,ageException
	{
		// TODO Auto-generated constructor stub
		System.out.println("Please enter the student details");
		System.out.println("First Name");
		firstName=s.next();
		status=nameCheck(firstName);
		
		System.out.println("Middle Name");
		middleName=s.next();
		status=nameCheck(middleName);
		System.out.println("Last Name");
		lastName=s.next();
		status=nameCheck(lastName);
		System.out.println("Age");
		age=s.nextInt();
		if (age<0)
		{
			throw new ageException("Age cannot be negative");
		}
		
		System.out.println("The student details are \nName "+firstName+" "+middleName+" "+lastName);
		System.out.println("Age is "+age);	
		
		
	}
	
	boolean nameCheck(String s) throws nameExcpetion
	{
		int i;
		int count =0;
		for (i = 0; i < s.length(); i++) 
		{
			 
            // Checking the character for not being a
            // letter,digit or space
            if (!Character.isLetter(s.charAt(i))
                && !Character.isWhitespace(s.charAt(i))) 
            {
                // Incrementing the countr for spl
                // characters by unity
                count++;
            }
        }
		if (count == 0)
			 
            // Display the print statement
           return true;
        else
 
            throw new nameExcpetion("Name cannot have a special characters and digits");
		
	}
	
	
	
}


class nameExcpetion extends Exception
{
	public nameExcpetion(String st) {
		super(st);
	}
}

class ageException extends Exception
{
	public ageException(String st)
	{
		super(st);
	}
}

