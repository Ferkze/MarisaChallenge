public class Main {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(sumPrimes(numbers));
	}

	public static int sumPrimes(int[] numbers) {
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (isPrime(numbers[i])) {
				sum += numbers[i];
			}
		}

		return sum;
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}