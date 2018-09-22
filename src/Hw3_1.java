public class Hw3_1 {
	// Driver 
	// Hw 3.4
	private static int calls;
	private static int  callsFaster;
	
	public static void main(String[] args) {
		
		double x = 2;
		
		
		// Driver routine for 3.2
		for(int i = 0; i < 11; i++) {
			
			calls = 0;
			//2^p = 0, 2, 3, ..., 10
			if(i == 1) {
				continue;
			}
			else {
				System.out.println(x + " raised by the power of " + i + " is: " + power(x,i));
				
			}
		
		}
		// Hw 3.4
		System.out.println("Total calls: " + calls);
		
		System.out.println("---------------------------------");
		
		//Driver routine for 3.3
		
		for(int i = 0; i < 11; i++) {
			
			callsFaster = 0;
			//2^p = 0, 2, 3, ..., 10
			if(i == 1) {
				continue;
			}
			else {
				System.out.println(x + " raised by the power of " + i + " is: " + powerFaster(x,i));
			}
		
		}
		// Hw 3.4
		System.out.println("Total calls: " + callsFaster);
	}
	
	// Hw 3.2
	public static double power(double x, int n) {
		// Hw 3.4
		calls++;
		
		if(n == 0) {
			return 1;
		}
		if(x == 1) {
			return x;
		}
		else {
			return x * power(x,n-1);
		}
	}
	
	// Hw 3.3
	public static double powerFaster(double x, int n) {
		// Hw 3.4
		callsFaster++;
		if(n == 0) {
			return 1;
		}
		else if(n % 2 == 0) {
			return powerFaster(x, n/2) * powerFaster(x, n/2);
		}
		else {
			return x * power(x, n/2) * power(x, n/2);
		}
		
	}
}
