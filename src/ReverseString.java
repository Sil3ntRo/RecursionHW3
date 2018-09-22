import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.print("Enter a string and the program shall reverse it: ");
		s = sc.nextLine();
		
		System.out.println(reverse(s));
		sc.close();
	}
	
	public static String reverse(String s) {
		if(s.length() == 0) {
			return s;
		}
		else {
			return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
		}
	}
}
