import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Set;

public class RunGenerator {

	static int totalBalls = 24;
	static int totalRun = 40;
	static int playersLeft = 4;
	static HashMap<String, int[]> hm;

	public static void main(String[] args) {
		String[] players = { "Kirat Boli", "N.S.Nodhi", "R Rumrah",
				"Shashi Henra" };
		hm = new LinkedHashMap<String, int[]>();
		int[] kbProb = { 5, 30, 25, 10, 15, 1, 9, 5 };
		int[] nsProb = { 10, 40, 20, 5, 10, 1, 4, 10 };
		int[] rrProb = { 20, 30, 15, 5, 5, 1, 4, 20 };
		int[] ssProb = { 30, 25, 5, 0, 5, 1, 4, 30 };

		hm.put(players[0], kbProb);
		hm.put(players[1], nsProb);
		hm.put(players[2], rrProb);
		hm.put(players[3], ssProb);

		startMatch(hm);
	}

	public static void setupMatch(HashMap<String, int[]> playersStat) {
		

	}

	public static void startMatch(HashMap<String, int[]> playersStat) {
		String onStrike = "Kirat Boli";
		String nonStrickerEnd = "N.S.Nodhi";
		for (int i = 0; i < 24; i++) {
			System.out.println(runGenerator(onStrike));
		}

	}

	public static void scoreStat(String overLeft, String runLeft) {
		String str = overLeft + " overs left." + runLeft + " to win";
	}

	public static void commentary(String ballNumber, String score, String player) {
		int run = Integer.parseInt(score);
		String str = "";
		if (run == 0 || run == 1) {
			str = ballNumber + " " + player + " " + "scores" + score + "run";
		}

		if (run > 1) {
			str = ballNumber + " " + player + " " + "scores" + score + "runs";
		}
		System.out.println(str);

	}

	public static String runGenerator(String playerName) {
		int[] probs = hm.get(playerName);
		int dotProb = probs[0];
		int oneProb = probs[1];
		int twoProb = probs[2];
		int threeProb = probs[3];
		int fourProb = probs[4];
		int fiveProb = probs[5];
		int sixProb = probs[6];
		int outProb = probs[7];

		Random random = new Random();
		final int prob = random.nextInt(100);
		if (prob <= dotProb) {
			return "0";
		}
		if (prob <= (dotProb + oneProb)) {
			return "1";
		}
		if (prob <= (oneProb + twoProb)) {
			return "2";
		}
		if (prob <= (twoProb + threeProb)) {
			return "3";
		}
		if (prob <= (threeProb + fourProb)) {
			return "4";
		}
		if (prob <= (fourProb + fiveProb)) {
			return "5";
		}
		if (prob <= (fiveProb + sixProb)) {
			return "6";
		}

		if (prob <= (sixProb + outProb)) {
			return "out";
		}
		return "out";
	}
}
