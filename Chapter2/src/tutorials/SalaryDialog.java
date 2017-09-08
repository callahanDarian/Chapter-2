package tutorials;

import javax.swing.JOptionPane;

public class SalaryDialog {

	public static void main(String[] args) 
	{
		String wageString, dependentString, hoursInWeekString;
		
		double weeklyPay;
		int dependents;
		double HOURS_IN_WEEK = 37.5;
		
		hoursInWeekString = JOptionPane.showInputDialog(null, "Enter your hours in the week", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
		HOURS_IN_WEEK = Double.parseDouble(hoursInWeekString);
		
		wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage", "Salary dialog 2", JOptionPane.INFORMATION_MESSAGE);
		weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
		
		dependentString = JOptionPane.showInputDialog(null, "How many dependents?", "Salary dialog 3", JOptionPane.QUESTION_MESSAGE);
		dependents = Integer.parseInt(dependentString);
		
		JOptionPane.showMessageDialog(null, "Weekly salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + " dependents");
		
	}

}