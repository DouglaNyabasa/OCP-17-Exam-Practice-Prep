
public class Calculate{
   
	public static void main(String [] args){
	
	  Calculator calculator = (a,b) -> {return a + b;};

	  System.out.println(calculator.add(2,2));
	}
}

interface Calculator{
  int add(int a, int b);
}

