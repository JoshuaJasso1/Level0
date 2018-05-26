import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testScore = JOptionPane.showInputDialog("What was your test score");
		double value = Double.parseDouble(testScore);
		if (value >= 90) {
			JOptionPane.showMessageDialog(null, "Great Job!");
		} else if (value >= 80) {
			JOptionPane.showMessageDialog(null, "Try harder");
		} else if (value >= 70) {
			JOptionPane.showMessageDialog(null, "Study harder next time");
		} else if (value <= 50) {
			JOptionPane.showMessageDialog(null, "You are disowned by your family");
		}
	}

}
