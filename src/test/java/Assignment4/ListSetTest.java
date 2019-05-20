package Assignment4;

import java.util.Iterator;

public class ListSetTest extends ListAndSet{
	
	public static void main(String[] args) {
	ListAndSet s = new ListAndSet();
	s.addCar("SUV");
	s.addVowels("a");
	s.addVowels("e");
	s.addVowels("e");
	Iterator<String> itr = s.iterator();
    while (itr.hasNext()) {
         System.out.println(itr.next());}
	}
	}
	


