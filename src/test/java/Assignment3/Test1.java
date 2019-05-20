package Assignment3;

class Superclass1 {
	
	  protected int addTwoNumbers(int a, int b){
			return a+b;
	}
}

public class Test1 extends Superclass1{

	  public int addTwoNumbers(int a, int b,int c){
			return a+b+c;
	}
public static void main(String[] args){
	Test1 obj = new Test1();
    System.out.println(obj.addTwoNumbers(11, 22, 33));
	
		}
   }
