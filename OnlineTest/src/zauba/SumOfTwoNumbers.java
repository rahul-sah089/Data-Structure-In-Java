package zauba;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfTwoNumbers {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a[] = new int[st.countTokens()];
			int ii = 0;
			while (st.hasMoreTokens()) {
				a[ii++] = Integer.parseInt(st.nextToken());
			}
			int sum = sum(a);
			System.out.println(sum);
		}

	}

	public static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
