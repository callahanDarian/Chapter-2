package excersises;

import javax.swing.JOptionPane;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) 
	{
		int quartInt, gallonInt, quartTotal, gallonTotal;
		String quartStr, gallonStr;
		String question = "?";
		
		gallonStr = JOptionPane.showInputDialog(null, "How many Gallons? \nPlease input '?' if the amount is unknown.");
		if (gallonStr.equals(question))
		{
			gallonInt = 0;
		}
		else
		{
			gallonInt = Integer.parseInt(gallonStr);
		}
		
		quartStr = JOptionPane.showInputDialog(null, "How many quarts?");
		quartInt = Integer.parseInt(quartStr);
		
		gallonTotal = gallonInt + (quartInt / 4);
		quartTotal = quartInt % 4;
		
		JOptionPane.showMessageDialog(null, "You have input : \n Gallons : " + gallonTotal + "\n Quarts : " + quartTotal);

	}
}
