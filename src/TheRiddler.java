import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerScore = 0;
		String answer = JOptionPane.showInputDialog(null,
				"What can travel around the world while staying in a corner?");
		if (answer.toLowerCase().contains("stamp")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			playerScore = playerScore + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong. A stamp, is the correct answer.");
		}
		String response = JOptionPane.showInputDialog(null, "What has a head and a tail, but no body?");
		if (response.toLowerCase().contains("coin")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			playerScore = playerScore + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong. The correct answer is a coin.");
		}
		String output = JOptionPane.showInputDialog(null, "What has an eye but can not see?");
		if (output.toLowerCase().contains("needle")) {
			JOptionPane.showMessageDialog(null, "Correct");
			playerScore = playerScore + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer is a needle");
		}
		JOptionPane.showMessageDialog(null, "You got " + playerScore + " questions correct");
	}

}
