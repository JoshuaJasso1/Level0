import javax.swing.JOptionPane;

public class Rollercoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ageString = JOptionPane.showInputDialog(null, "What is your height in inches?");
		int age = Integer.parseInt(ageString);
		if (age >= 48) {
			JOptionPane.showMessageDialog(null, "You may proceed on to the rollercoaster");
		} else {
			JOptionPane.showMessageDialog(null, "You need to be 48 inches in order to ride the rollercoaster");
		}
	}

}
