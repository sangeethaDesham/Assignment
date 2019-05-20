package Assignment4;

import java.util.Iterator;

public class ListSetTest extends ListAndSet{
	
	public static void main(String[] args) {
	ListAndSet s = new ListAndSet();
	s.addCar("SUV");
    Iterator<String> itr = s.iterator();
    while (itr.hasNext()) {
         System.out.println(itr.next());}
		}
	
	}
	


