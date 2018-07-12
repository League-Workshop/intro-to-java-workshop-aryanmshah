package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		Random randy = new Random();
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)

		int ph = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dh = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int pd = 10;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dd = 15;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(ph>0 && dh>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String Input=JOptionPane.showInputDialog("YELL OR KICK");
		// 9. If they typed in "yell":
		if (Input.equalsIgnoreCase("YELL")) {
			 dd = randy.nextInt(11);
			 dh -= dd;
		}
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		if (Input.equalsIgnoreCase("kick")) {
	      dd = randy.nextInt(26);
			 dh -= dd;
		}
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
	
		
			 pd = randy.nextInt(26);
			
		
		// 12. Subtract this number from the player's health
		
			 ph -= pd;
		
		// 13. If the user's health is less than or equal to 0
		if (ph<0) {
			JOptionPane.showMessageDialog(null, "You Lose");
		}
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
		if (dh<0) {
			JOptionPane.showMessageDialog(null, "You Win!!!");
		}
	   //  15.  Else
		else {
			JOptionPane.showMessageDialog(null, "your health:"+ph +"  dragons health:" + dh);
		}
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
	}

}