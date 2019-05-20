package Assignment3;

class Superclass {
	
int num = 100;
	}

public class Subclass extends Superclass{
	
	int num = 110;
	void printNumber() {
		System.out.println(num);
	}
	
	public static void main(String[] args)
	{
		Subclass obj= new Subclass();
		obj.printNumber();
	
		}
   }
