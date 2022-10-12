import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {

		int count = 0;
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				count++;
				break;
			}
		}

		if (count < 1) {
			System.out.println(x + " is a prime number");
		} else {
			System.out.println(x + " is not a prime number");
		}
	}
}



