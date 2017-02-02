package inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindProduct {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCase = Integer.parseInt(br.readLine());

		int a[] = new int[noOfTestCase];
		int i = 0;
		StringTokenizer strTokenizer = new StringTokenizer(br.readLine());
		while (strTokenizer.hasMoreTokens()) {
			a[i++] = Integer.parseInt(strTokenizer.nextToken());
		}

		System.out.println(findProduct(a));
	}

	public static long findProduct(int a[]) {
		long product = 1;
		for (int i = 0; i < a.length; i++) {
			product = (product * a[i]) % 1000000007;
		}

		return product;
	}

}
