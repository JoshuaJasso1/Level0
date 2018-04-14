import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {

		String yes = "yes";
		String no = "no";
		String answer = JOptionPane.showInputDialog("Are You Happy?");
		if (answer.toLowerCase().equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		} else if (answer.toLowerCase().equals("no")) {
			String answers = JOptionPane.showInputDialog(null, "Do you want to be happy?");
			if (answers.toLowerCase().equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change Something");
			}else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
	}

}
