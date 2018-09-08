import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		Random random = new Random();
		int x1 = random.nextInt(61);
		int x2 = random.nextInt(61);
		int x3 = random.nextInt(61);
		int x4 = random.nextInt(61);
		int x5 = random.nextInt(61);
		JOptionPane.showMessageDialog(null, " " + x1 + " " + x2 + " " + x3 + " " + x4 + " " + x5);
	}

}
