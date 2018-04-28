import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = JOptionPane.showInputDialog("What is your zodiac sign?");
		if (answer.toLowerCase().equals("aries")) {
			JOptionPane.showMessageDialog(null,
					"You're still chatting away with just about anyone who comes within a few feet of you");
		} else if (answer.toLowerCase().equals("taurus")) {
			JOptionPane.showMessageDialog(null,
					"You pride yourself on your ability to say an awful lot in a very short amount of time. So when you wake up in the middle of an especially long diatribe and catch yourself wondering who that was who was going on for so very long, don't panic.");
		} else if (answer.toLowerCase().equals("gemini")) {
			JOptionPane.showMessageDialog(null, "Because you are curious, you are going to have an adventurous day");
		} else if (answer.toLowerCase().equals("cancer")) {
			JOptionPane.showMessageDialog(null,
					"You've just got to tell someone, and you can't wait any longer. Is that it? Well, if you really must discuss a particular issue, be absolutely sure the person you choose as confidante is trustworthy.");
		} else if (answer.toLowerCase().equals("leo")) {
			JOptionPane.showMessageDialog(null,
					"It's been far too long since you've spoken to a certain someone, and you're ready to put an end to this nonsense, no matter how you left it with them last time. The funny part is that you may think you see them on the street today, or maybe in the supermarket, and that's when you'll recognize your need to get back into contact.");
		} else if (answer.toLowerCase().equals("virgo")) {
			JOptionPane.showMessageDialog(null,
					"A higher-up you've admired and respected for some time is about to let you know that the feelings are mutual, and what could be better than having the respect of your mentor?");
		} else if (answer.toLowerCase().equals("libra")) {
			JOptionPane.showMessageDialog(null,
					"Visit the travel agent on the way home from work tonight, just to get inspired. Then you can spend some time online looking at room and flight rates. One way or the other, you really should treat yourself to a trek.");
		} else if (answer.toLowerCase().equals("scorpio")) {
			JOptionPane.showMessageDialog(null,
					"You're ready to travel, to take off for somewhere you've never been, possibly even with someone you've never traveled with before. Well, regardless of whether it's a different state, a different coast or a different country, you'd better make up your mind quickly. Putting off travel plans only means they won't come to pass and that simply won't do. Ready? Or not?");
		} else if (answer.toLowerCase().equals("sagittarius")) {
			JOptionPane.showMessageDialog(null,
					"It doesn't take much to talk you into a change of scenery -- so if someone suggests a trip to you, you'll have your planner out and your boss on the phone in record time.");
		} else if (answer.toLowerCase().equals("capricorn")) {
			JOptionPane.showMessageDialog(null,
					"Better get your chores done now because, in a couple of days, a certain someone will make it their business to completely monopolize all your attention.");
		} else if (answer.toLowerCase().equals("aquarius")) {
			JOptionPane.showMessageDialog(null,
					"If you're single, it's time to get out there and resume the hunt for the perfect partner. You'll be amazed at how many prospective admirers will want to have a shot at that same title. All you have to do is get dressed and get out there.");
		} else if (answer.toLowerCase().equals("pisces")) {
			JOptionPane.showMessageDialog(null,
					"Take a look around your home or apartment. If you're not happy with what you see, step up and make some changes. Whether you decide to take out a wall, put on an addition or just put some fresh paint up, you'll feel like you have a brand-new place");
		} else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}
	}
}
