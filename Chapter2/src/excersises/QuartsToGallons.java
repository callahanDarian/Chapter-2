package excersises;

import javax.swing.JOptionPane;

public class QuartsToGallons {

	public static void main(String[] args) 
	{
		int quartInt, gallonInt, quartTotal;
		
		quartInt = 6;
		gallonInt = quartInt / 4;
		
		quartTotal = quartInt % 4;
		
		JOptionPane.showMessageDialog(null, "You have : \n Gallons : " + gallonInt + "\n Quarts : " + quartTotal);

	}
}
