import javax.swing.JOptionPane;

public class LastSummer {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, "I know that you slept last summer, " + name + ". Muhahahaha!");
	}

}
