package excersises;

import javax.swing.JOptionPane;

public class NauticalMilesInteractive {

	public static void main(String[] args) 
	{
		double kiloInNaut, mileInNaut, nautMile, kilo, mile;
		kiloInNaut = 1.852;
		mileInNaut = 1.150779;
		
		nautMile = 8;
		
		kilo = nautMile / kiloInNaut;
		mile = nautMile / mileInNaut;
		
		JOptionPane.showMessageDialog(null, "Nautical Miles : " + nautMile + "\nMiles : " + mile + "\nKilometers : " + kilo);
		
	}

}
