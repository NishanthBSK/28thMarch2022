
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			Studnt st1=new Studnt("Student1");
			//Studnt st2=new Studnt("Student2");
			st1.t.start();
			//st2.t.start();
			for(int i=0 ;i<5;i++)
			{
				System.out.println("Main Thread"+i);
				Thread.sleep(5000);
			}
			
			
		
		}
		catch (nameExcpetion e)
		{
			System.out.println(e.getMessage());
		}
		catch (ageException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InterruptedException e)
		{
			System.out.println("caught Interrupted exception");
		}
		System.out.println("exiting Main Thread");
		
		

	}

}

class Studnt implements Runnable
{
	int age;
	String firstName;
	String middleName;
	String lastName;
	Scanner s=new Scanner(System.in);
	boolean status;
	Thread t;
	
	public Studnt(String s) throws nameExcpetion,ageException
	{	
		t=new Thread(this, s);
		System.out.println("Child Thread"+t);
		
		// TODO Auto-generated constructor stub
		
	}
	
	public void run()
	{
		try
		{
			System.out.println("Please enter the student details of "+t.getName());
		
			System.out.println("First Name of "+t.getName());
			Thread.sleep(500);
			firstName=s.next();
			status=nameCheck(firstName);
		
			System.out.println("Middle Name of "+t.getName());
			Thread.sleep(500);
			middleName=s.next();
			status=nameCheck(middleName);
			System.out.println("Last Name of "+t.getName());
			Thread.sleep(500);
			lastName=s.next();
			status=nameCheck(lastName);
			System.out.println("Age of "+t.getName());
			Thread.sleep(500);
			age=s.nextInt();
			Thread.sleep(500);
			if (age<0)
			{
				throw new ageException("Age cannot be negative");
			}
		
			System.out.println("The student details of "+ t.getName() +" are \nName "+firstName+" "+middleName+" "+lastName);
			System.out.println("Age is "+age);	
		
			
		}
		
		catch (nameExcpetion e)
		{
			System.out.println(e.getMessage());
		}
		catch (ageException e)
		{
			System.out.println(e.getMessage());
		}
		catch(InterruptedException e)
		{
			System.out.println("caught Interrupted exception");
		}
		
		System.out.println("exiting Child Thread");
		
		
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
