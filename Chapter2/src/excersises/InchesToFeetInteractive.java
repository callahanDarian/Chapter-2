package excersises;

import javax.swing.JOptionPane;

public class InchesToFeetInteractive {

	public static void main(String[] args) 
	{
		int inch, feet, inchTotal, feetTotal, dumb;
		String inchStr, feetStr;
		String question = "?";
		
		feetStr = JOptionPane.showInputDialog(null, "Please input a measurement of feet. \nIf unknown, please input '?'.");
		if (feetStr.equals(question))
		{
			dumb = 1;
			feet = 0;
		}
		else
		{
		feet = Integer.parseInt(feetStr);
		dumb = 0;
		}
		
		inchStr = JOptionPane.showInputDialog(null, "Please input a measurement of inches. \nIf unknown, please input '?'.");
		if (inchStr.equals(question) && dumb == 1)
		{
			JOptionPane.showMessageDialog(null, "There really is no helping you...");
			System.exit(0);
			inch = 0;
		}
		else
		{
		inch = Integer.parseInt(inchStr);
		}
		
		feetTotal = feet + (inch / 12);
		inchTotal = inch % 12;
		
		JOptionPane.showMessageDialog(null, "You have input : \n Feet : " + feetTotal + "\nInches : " + inchTotal);
	}

}
