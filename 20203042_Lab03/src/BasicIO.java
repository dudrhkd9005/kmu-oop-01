import java.util.*;
// An exploration of basic input and output.
class BasicIO {
	// Reads and processes string input.
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		System.out.print("Enter your age: ");
		int years = stdin.nextInt();
		System.out.print("Enter your height: ");
		int height = stdin.nextInt();
		System.out.println("your name is " + name + " your age is " + years + " your height is " + height);
		System.out.println("days : " + years * 365);
		System.out.printf("2020년 10월 03일 현재 " + name + "(" + years + ")" + "의 키는 " + height + " cm 입니다.");
	}
}