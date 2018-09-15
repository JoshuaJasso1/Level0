import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ageString = JOptionPane.showInputDialog(null, "What is your age?");
		int age = Integer.parseInt(ageString);
		if (age >= 18) {
			JOptionPane.showInputDialog(null,
					"Who do you think should be the next president of the great United States?");
			JOptionPane.showMessageDialog(null, "Thank you for your input.");
		} else {
			JOptionPane.showMessageDialog(null, "Nobody cares about what you think!");
		}
	}

}
