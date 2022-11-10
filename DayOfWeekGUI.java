// Get the JOptionPane class
import javax.swing.JOptionPane;
public class DayOfWeekGUI 
{

	public static void main(String[] args) 
	{
		 //ask user to input the day
		 String dayStr = JOptionPane.showInputDialog("Enter day: ");
		 // Obtain String daystr from input dialog and convert into int day
		 int day = (int)Double.parseDouble(dayStr);
		 
		 //ask user to input the month
		 String monthStr = JOptionPane.showInputDialog("Enter month: ");
		 // Obtain String monthstr from input dialog and convert into int month
		 int month = (int)Double.parseDouble(monthStr);
		 
		 //ask user to input the year
		 String yearStr = JOptionPane.showInputDialog("Enter year: ");
		 // Obtain String yearstr from input dialog and convert into int year
		 int year = (int)Double.parseDouble(yearStr);
		 
		 int m = month + 12 * ((14-month) / 12) - 2;
		 int y = year - (14 - month) / 12;
		 int x = y + y/4 - y/100 + y/400;
		 int d = (day + x + (31 * m) / 12) % 7;
		 
		 String strresult = "The day of week is " + d;
		//display the result
		 JOptionPane.showMessageDialog(null, strresult);


	}

}
