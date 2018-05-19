import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testScore = JOptionPane.showInputDialog("What is was your test score");
		double value = Double.parseDouble(testScore);
		if (value >= 90) {
			JOptionPane.showMessageDialog(null, "Great Job!");
		}
		else if (value >= 80) {
			JOptionPane.showMessageDialog(null, "Try harder");
		}
	}
	

}
