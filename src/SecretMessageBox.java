import javax.swing.JOptionPane;

public class SecretMessageBox {

	public static void main(String[] args) {
		String password = "12345";
		String answer = JOptionPane.showInputDialog("What is the secret password?");
		if (answer.equals ("12345")){
			JOptionPane.showMessageDialog(null, "You're awesome");
		}else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!");
		}

	}

}
