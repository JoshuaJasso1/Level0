import javax.swing.JOptionPane;

public class IKnowWhatYouDidLastSummer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "I know that you slept last summer, " + name + ". Muhahaha!");
	}

}
