package inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		StringBuilder strB = new StringBuilder(str1);
		String str2 = String.valueOf(strB.reverse());
		if (str1.equals(str2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
