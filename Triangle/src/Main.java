import java.util.Scanner;


public class Main {
	public static void main(String []args){
		System.out.println("Enter a, b, c");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		function A= new function();
		
		System.out.println(A.triangle(a, b, c));
	}
}
