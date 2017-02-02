package inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicalWord {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCase = Integer.parseInt(bf.readLine());
		for (int i = 0; i < noOfTestCase; i++) {
			int length = Integer.parseInt(bf.readLine());
			char a[] = new char[length];
			String inputStr = bf.readLine();
			a = inputStr.toCharArray();
			for (int ii = 0; ii < a.length; ii++) {
				System.out.print(nearestPrime(a[ii]));
			}
		}

	}

	public static char nearestPrime(char ch) {
		int val = 0;
		int lowerChar = findNearestHigher(ch);
		int higherChar = findNearestLower(ch);
		if ((ch - lowerChar) <= (higherChar - ch)) {
			val = lowerChar;
		} else {
			val = higherChar;
		}
		System.out.println("Value::"+val);
		return (char) val;
	}

	public static int findNearestLower(char ch) {
		int value = 0;
		for (int i = ch; i > 0; i--) {
			if (isPrime(i)) {
				value = i;
			}
		}
		return value;

	}

	public static int findNearestHigher(char ch) {
		int value = 0;
		for (int i = ch; i < 200; i++) {
			if (isPrime(i)) {
				value = i;
			}
		}
		return value;
	}

	public static int returnAscii(char c) {
		return c;
	}

	public static boolean isPrime(int number) {
		boolean status = false;
		if (number == 2) {
			status = true;
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % 2 == 0) {
					status = true;
					break;
				}
			}
		}
		return status;
	}
}
