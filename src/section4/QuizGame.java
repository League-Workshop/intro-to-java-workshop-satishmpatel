package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		speak("Satish's Math Games");
		JOptionPane.showMessageDialog(null, "Satish's Math Games");

		// 2. Ask the user a question
		speak("What is 2+1?");
		String answer1 = JOptionPane.showInputDialog("What is 2+1?");
		// 3. Use an if statement to check if their answer is correct
		if (answer1.equals("3")) {

			// 4. if the user's answer is correct

			// -- add one to their score
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!");

		}
		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		String answer2 = JOptionPane.showInputDialog("What is 50*1?");
		if (answer2.equals("50")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!!");
		}

		String answer3 = JOptionPane.showInputDialog("What is (10*5)*(25+45)?");
		if (answer3.equals("3500")) {
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "WRONG!!!");
		}

		// 6. After all the questions have been asked, print the user's score
		JOptionPane.showMessageDialog(null, "Score: " + score + "/4");
		// Answer: 67345
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
