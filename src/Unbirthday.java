import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog(null, "What is your birthday (mm/dd)");
		if (birthday.equals ("01/13")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Happy very merry UNbirthday!");
		}
	}

}
