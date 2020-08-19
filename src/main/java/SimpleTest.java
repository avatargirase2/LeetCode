import java.util.Arrays;

public class SimpleTest {

	static int arrayMaximalAdjacentDifference(int[] inputArray) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < inputArray.length - 1; i++) {
			max = Math.max(max, Math.abs(inputArray[i] - inputArray[i + 1]));
		}

		return max;
	}

	static boolean isIPv4Address(String inputString) {

		String[] numbers = inputString.split("\\.");

		boolean flag = false;
		for (String s : numbers) {

			try {
				int val = Integer.parseInt(s);

				if (val >= 0 && val < 500) {
					flag = true;
				} else {
					return false;
				}

			} catch (Exception ex) {
				return false;
			}

			
		}
		return flag;
	}

	public static void main(String[] args) {

		arrayMaximalAdjacentDifference(new int[] { 10, 11, 13 });

		isIPv4Address("1");
	}

}
