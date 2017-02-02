package inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToggleString {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		StringBuilder strB = new StringBuilder(str);

		for (int i = 0; i < strB.length(); i++) {
			char ch = strB.charAt(i);
			if (Character.isUpperCase(ch)) {
				strB.setCharAt(i, Character.toLowerCase(ch));
			} else {
				strB.setCharAt(i, Character.toUpperCase(ch));
			}
		}

		System.out.println(strB);
	}
}
