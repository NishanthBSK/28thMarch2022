import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class ObjectArrayTest2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		TreeSet<Integer> primeNumbers = new TreeSet();
//		System.out.println("adding first prime");
//		primeNumbers.add(2);
//
//		System.out.println("adding 2nd prime");
//		primeNumbers.add(3);
//
//		System.out.println("adding 3rd prime");
//		primeNumbers.add(5);
//
//		System.out.println("adding 4th prime");
//		primeNumbers.add(7);
//		primeNumbers.add(11);
//		primeNumbers.add(13);
//		primeNumbers.add(17);
//		primeNumbers.add(19);
//		System.out.println("added all the primes");
//
//		Iterator<Integer> primeIterator = primeNumbers.iterator();
//		while(primeIterator.hasNext()) {
//			int x = (int) primeIterator.next();
//			System.out.println("prime "+x);
//		}
//
//
//		//fibonacci series
//		//0 1 1 2 3 5 8 13 
//
//		Employee e1 = new Employee(5,"jack",4000);
//		Employee e2 = new Employee(95,"jane",3000);
//		Employee e3 = new Employee(1,"jill",2000);
//
////		ArrayList<Employee> staff = new ArrayList<Employee>(); //just 5 references | no allocation for empno,ename, salary
////		LinkedList<Employee> staff = new LinkedList<Employee>(); //just 5 references | no allocation for empno,ename, salary
////		HashSet<Employee> staff = new HashSet<Employee>(); //just 5 references | no allocation for empno,ename, salary
//		TreeSet<Employee> staff = new TreeSet<Employee>(); //just 5 references | no allocation for empno,ename, salary
//		System.out.println("Tree set is created....");
//
//
//		System.out.println("trying to add 1st object...");
//		staff.add(new Employee(35,"Shashi",5000)); //allocate empno,ename,salary
//
//		System.out.println("trying to add 2nd object...");
//		staff.add(new Employee(12,"Ayan",6000));
//
//		System.out.println("trying to add 3rd object...");
//		staff.add(new Employee(65,"Nimya",7000));
//
//		System.out.println("trying to add 4th object...");
//		staff.add(new Employee(10,"KrishnaKumar",8000));
//
//		System.out.println("trying to add 5th object...");
//		staff.add(new Employee(85,"Suraj",9000));
//
//		System.out.println("trying to add 6th object...");
//		staff.add(e1);
//
//		System.out.println("trying to add 7th object...");
//		staff.add(e2);
//
//		System.out.println("trying to add 8th object...");
//		staff.add(e3);
//
//		System.out.println("Adding 9th employee...");
//		staff.add(new Employee(109,"Sourabh",10000));
//
//		System.out.println("Added the 9th employee....");
//
//
//		Iterator<Employee> iterator = staff.iterator();
//
//		while(iterator.hasNext()) {
//			Employee theEmp = iterator.next();
//			System.out.println("employee : "+theEmp);
//		}
//
//
	}
		
	LinkedList<Contact> ll=new LinkedList<Contact>();
	//ll.add(new Contact("rohith", "9036803535", "rohithb@gmail.com"));

}

class Contact
{
	String contactName;
	String mobileNumber;
	String email;
	public Contact(String contactName, String mobileNumber, String email) {
		super();
		this.contactName = contactName;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [contactName=" + contactName + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
	
	
}
class ChemicalElement
{
	int atomicNumber;
	String atomicName;
	int atomicWeight;
	public ChemicalElement(int atomicNumber, String atomicName, int atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicWeight = atomicWeight;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicWeight="
				+ atomicWeight + "]";
	}
	
	
}
class Book
{
	int bookNumber;
	String bookName;
	String author;
	int noOfPages;
	int edition;
	int Price;
	public Book(int bookNumber, String bookName, String author, int noOfPages, int edition, int price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.noOfPages = noOfPages;
		this.edition = edition;
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", noOfPages="
				+ noOfPages + ", edition=" + edition + ", Price=" + Price + "]";
	}
	
	
	
}




