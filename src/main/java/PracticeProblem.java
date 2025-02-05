import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		String in = scanner.nextLine();
		System.out.println(in);
		scanner.close();
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.print("In: ");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println(a / b);
		System.out.println(a % b);
		scanner.close();
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		String in = scanner.nextLine();
		System.out.println(in + " was the text you wrote");
		scanner.close();
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println(n * 5);
		scanner.close();
	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		boolean b = scanner.nextBoolean();
		scanner.nextLine();
		System.out.println(b + " is a boolean");
		scanner.close();
	}

	public static void q6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("In: ");
		double d = scanner.nextDouble();
		scanner.nextLine();
		System.out.println(d - 3.2);
		scanner.close();
	}

}
