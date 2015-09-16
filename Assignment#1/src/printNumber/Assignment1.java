package printNumber;

public class Assignment1 {

	public static void main(String[] args) {
		int value = 0;
		
		while (value < 30) {
			
			value = value + 1;
			if	(value % 3 == 0 && value % 5 != 0){
				
				System.out.println("Fizz");
				
			}	else if (value % 5 == 0 && value % 3 != 0)
			{
				
				System.out.println("Buzz");	
			
			}  else if (value % 3 == 0 && value % 5 == 0 )
			{
			
				System.out.println("FizzBuzz");	
			
			} 	else {
				
				System.out.println(value);
			
			}
			
		}

	}

}
