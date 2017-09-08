package excersises;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Eggs {

	public static void main(String[] args) 
	{
		double singlePrice, dozenPrice, totalPrice;
		int single, dozen, egg;
		String eggs;
		DecimalFormat df = new DecimalFormat("$0.00");
		
		eggs = JOptionPane.showInputDialog(null, "How many eggs would you like to purchase? \n Single : $0.45\n Dozen : 3.25");
		egg = Integer.parseInt(eggs);
		
		single = ( egg % 12 );
		dozen = ( egg / 12 );
		
		singlePrice = single * 0.45;
		dozenPrice = dozen * 3.25;
		
		totalPrice = singlePrice + dozenPrice;
		if (single == 1)
		{
			JOptionPane.showMessageDialog(null, "You have purchased " + egg + " eggs.\n\nThat was " + dozen + " dozen at " + df.format(dozenPrice) + " and " + single + " loose egg at $0.45.\n\n"
					+ "Each dozen : $3.25\nEach single : $0.45\n \nYour total is " + df.format(totalPrice));
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You have purchased " + egg + " eggs.\n\nThat was " + dozen + " dozen at " + df.format(dozenPrice) + " and " + single + " loose eggs at " + df.format(singlePrice) + ""
					+ "\n\nEach dozen : $3.25\nEach single : $0.45\n \nYour total is " + df.format(totalPrice));
		}
	}

}
