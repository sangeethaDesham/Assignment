package Assignment4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListAndSet {

	LinkedList<String> Cars = new LinkedList<String>();

		   public void addCar(String car) {
		      Cars.add(car);
		   }

		   public Iterator<String> iterator() {
		      return Cars.iterator();
		}

	
	HashSet<String> Vowels = new HashSet<String>();
	   public void addVowels(String vowels1) {
		   Vowels.add(vowels1);
		   }

		   public Iterator<String> iterator1()
		   {
			return Vowels.iterator();
		     
		}	
  }



