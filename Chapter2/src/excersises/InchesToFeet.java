package excersises;

import javax.swing.JOptionPane;

public class InchesToFeet {

	public static void main(String[] args) 
	{
		int inch = 25;
		int feet;
		
		feet = inch % 12;
		inch = inch / 12;
		
		JOptionPane.showMessageDialog(null, "Feet : " + feet + "\nInches : " + inch);
	}

}
