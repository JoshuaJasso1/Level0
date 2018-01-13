import javax.swing.JOptionPane;

public class EverythingIsAwesome {

	public static void main(String[] args) {
		String likes = JOptionPane.showInputDialog(null, "What do you like?");
		JOptionPane.showMessageDialog(null, "I also like " + likes);

	}

}
