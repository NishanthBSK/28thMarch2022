import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("hi");
		ar.add("Nishanth");
		ar.add("here");
		
		//System.out.println(ar);
		String[] s=new String[ar.size()];
		s=ar.toArray(s);
		for(int i=0;i<s.length;i++)
		{	System.out.print((i+1)+"\t");
			System.out.println(s[i]);
			
		}
		*/
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Banana");
		ll.add("apple");
		System.out.println(ll);
		ll.addLast("orange");
		//ll.removeIf(n -> n.startsWith("B"));
		System.out.println(ll);
		
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Iterator<String> ditr=ll.descendingIterator();
		while(ditr.hasNext())
		{
			System.out.println(ditr.next());
		}
		ListIterator<String> listIt= ll.listIterator(0);
		System.out.println("List Iterator");
		while(listIt.hasNext())
		{
			System.out.println(listIt.next());
		}
		Set<String> daysOfWeek =new HashSet<String>();
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Monday");
		daysOfWeek.add(null);
		daysOfWeek.add(null);
		System.out.println(daysOfWeek);
		TreeSet<String> treeSet=new TreeSet<>(Comparator.reverseOrder());
		treeSet.add("Onion");
		treeSet.add("Potato");
		treeSet.add("Tomato");	
		System.out.println(treeSet);
		
		

	}

}
