import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		String answerString = JOptionPane.showInputDialog(null,
				"Give me a number, and I will tell you if it is prime or not.");
		int number = Integer.parseInt(answerString);
		boolean isPrime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			JOptionPane.showMessageDialog(null, "Your number is prime!");
		} else {
			JOptionPane.showMessageDialog(null, "Your number is not prime!");
		}
	}
}
