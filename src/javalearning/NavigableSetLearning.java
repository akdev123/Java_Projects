package javalearning;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetLearning {

	public static void main(String[] args) {
		
		NavigableSet<String> original = new TreeSet<String>();
		original.add("1");
		original.add("2");
		original.add("3");
		original.add("4");
		//Usage of Descending Set Method
		/*NavigableSet reverse = original.descendingSet();
		System.out.println(original);
		System.out.println(reverse);
		System.out.println(original);
		reverse.add("5");
		System.out.println("After Adding 5"+reverse);*/
		
		// Usage of Descending Iterator Method
		
		Iterator it = original.iterator();
		
		System.out.println("Original");
		while(it.hasNext()){
			System.out.print(it.next()+",");
			
		}
		
		Iterator reverse = original.descendingIterator();
		System.out.println("\nReversed");
		while(reverse.hasNext()){
		System.out.print(reverse.next()+",");
		}
		
		Iterator itAgain = original.iterator();
		
		System.out.println("\nOriginal Again");
		while(itAgain.hasNext()){
			
			System.out.print(itAgain.next()+",");
			
		}
		
		// Usage of headset() method
		
		System.out.println("\nHeadSet Method Test");
		
		SortedSet<String> headset = original.headSet("3");
		
		System.out.println(headset);

	}

}
