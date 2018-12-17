package Interview;

import java.util.Scanner;

public class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a number");
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println("enter number:");
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int c = a + b;
			System.out.print(c + " ");
			for (int j = 1; j < n; j++) {

				c = c + (int) Math.pow(2, j) * b;
				System.out.print(c + " ");

			}
		}
		in.close();

	}

}
