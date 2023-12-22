import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Insert a number: ");
		int x = input.nextInt();
		
		int sum = 0;
		
		while (x != 0) {
			sum = sum + x;
			System.out.print("Insert a number: ");
			x = input.nextInt();
			
		}
		
		System.out.print("Sum =" + sum);
		
		input.close();
	}
}
