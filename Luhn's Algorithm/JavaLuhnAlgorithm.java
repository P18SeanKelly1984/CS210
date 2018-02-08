
public class JavaLuhnAlgorithm {

	public static void main(String[] args) {
		validateCreditCardNumber("12345678903555");
		String imei = "012850003580200";
		validateCreditCardNumber(imei);
	}

	private static void validateCreditCardNumber(String imei2) {

		//new array called ints with the length of the string imei2
		int[] ints = new int[imei2.length()];
		
		//using for loop to gain int values from string imei
		for (int i = 0; i < imei2.length(); i++) {
			ints[i] = Integer.parseInt(imei2.substring(i, i + 1));
		}
		
		for (int i = ints.length - 2; i >= 0; i = i - 2) {
			int j = ints[i];
			j = j * 2;
			if (j > 9) {
				j = j % 10 + 1;
			}
			ints[i] = j;
		}
		int sum = 0;
		for (int i = 0; i < ints.length; i++) {
			sum += ints[i];
		}
		if (sum % 10 == 0) {
			System.out.println(imei2 + " is a valid credit card number");
		} else {
			System.out.println(imei2 + " is an invalid credit card number");
		}
	}

}