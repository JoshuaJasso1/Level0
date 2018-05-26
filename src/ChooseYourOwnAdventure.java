import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Welcome to my adventure.");
		String answer = JOptionPane.showInputDialog("Do you choose to take the a)blue pill or the b)red pill? ");
		if (answer.equalsIgnoreCase("a")) {
			JOptionPane.showMessageDialog(null, "You now have the ability to fly");
			JOptionPane.showMessageDialog(null, "One day, you see a lady flying out of the sky?");
			String response = JOptionPane
					.showInputDialog("What do you do, a) fly up and help the lady or b) play fortnite on your phone?");
			if (response.equalsIgnoreCase("a")) {
				JOptionPane.showMessageDialog(null, "You are the hero of the day. Good Job!");
			} else if (response.equalsIgnoreCase("b")) {
				JOptionPane.showMessageDialog(null, "Well you let somebody die");
			}
		} else {
			JOptionPane.showMessageDialog(null, "You now have super strength");
			JOptionPane.showMessageDialog(null, "One day you see a lightpost on top of someone.");
			String output = JOptionPane.showInputDialog(
					"You have two options, a) Go over and help her or b) Keep walking and do nothing?");
			if (output.equalsIgnoreCase("a")) {
				JOptionPane.showMessageDialog(null, "Great choice! You saved somebody's life.");
			} else {
				JOptionPane.showMessageDialog(null, "You allowed for somebody to die.");
			}
		}
	}

}
