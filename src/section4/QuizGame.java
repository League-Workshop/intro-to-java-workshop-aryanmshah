package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score= 0; 
		JOptionPane.showMessageDialog(null, "Algebra Quiz(do not put x in answer just right the number)");
		
		// 2.  Ask the user a question 
		String input1= JOptionPane.showInputDialog("(solve for x) 6x + 12=0"); 
		// 3.  Use an if statement to check if their answer is correct
		if (Integer.parseInt(input1) == -2) {
			score+=1;
		
		}
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		String input2= JOptionPane.showInputDialog("(solve for x) 12x-36=12"); 
		
		if (Integer.parseInt(input2) == 4) {
			score+=1;
		
		}
		
		
String input3= JOptionPane.showInputDialog("(solve for x) 2x+1=1"); 
		
		if (Integer.parseInt(input3) == 0) {
			score+=1;
		
		}
		
		// 4.  
		
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "your score is " + score +"/3");
	}
}
