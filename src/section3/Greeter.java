package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		System.out.println("math");
		String input = JOptionPane.showInputDialog("what is 4+12");

	   if(input.equals("16"))
	   {
		   JOptionPane.showMessageDialog(null, "correct"  );
	   }
	   else {
		   
		   JOptionPane.showMessageDialog(null, "incorrect" );
	   }
	}
}
