package excersises;

import javax.swing.JOptionPane;

public class NauticalMiles {

	public static void main(String[] args) 
	{
		double kiloInNaut, mileInNaut, nautMile, kilo, mile;
		String nautMileStr;
		String question = "?";
		kiloInNaut = 1.852;
		mileInNaut = 1.150779;
		
		nautMileStr =  JOptionPane.showInputDialog(null, "How many Nautical Miles? \nPlease input '?' if unknown");
		if (nautMileStr.equals(question))
		{
			JOptionPane.showMessageDialog(null, "I can't help you if you can't help yourself.");
			nautMile = 0;
			System.exit(0);
		}
		else 
		{
			nautMile = Double.parseDouble(nautMileStr);
		}
		
		
		kilo = nautMile / kiloInNaut;
		mile = nautMile / mileInNaut;
				
		JOptionPane.showMessageDialog(null, "Nautical Miles : " + nautMile + "\nMiles : " + mile + "\nKilometers : " + kilo);
		
	}

}
