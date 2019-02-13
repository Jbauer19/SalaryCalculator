import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;

public class SalaryCalc 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.setBounds(0,0,500,300);
		frame.setTitle("Salary Calculator");
		
		JLabel hour = new JLabel("Hour's per week");
		hour.setBounds(10,10,100,25);
		frame.add(hour);
		JLabel rate = new JLabel("Hourly Rate");
		rate.setBounds(10,60,100,25);
		frame.add(rate);
		
		JTextField txtHour = new JTextField();
		txtHour.setBounds(110,10,150,50);
		frame.add(txtHour);
		JTextField txtRate = new JTextField();
		txtRate.setBounds(110,60,150,50);
		frame.add(txtRate);
		
		JCheckBox box = new JCheckBox("Full Time");
		box.setBounds(15,100,150,50);
		frame.add(box);
		
		JButton butt = new JButton("Calculate");
		butt.setBounds(100,150,100,50);
		frame.add(butt);
		
		JLabel wage = new JLabel("Salary: ");
		wage.setBounds(220,150,500,50);
		frame.add(wage);
		
		butt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (box.isSelected())
				{
					double amount = (40 * Double.parseDouble(txtRate.getText()));
					String salary = Double.toString(amount);
					wage.setText(salary + " Dollars per week");
				}
				else if (box.isSelected() == false)
				{
					double amount = (Double.parseDouble(txtRate.getText()) * Double.parseDouble(txtHour.getText()));
					String salary = Double.toString(amount);
					wage.setText(salary + " Dollars per week");
				}
				else if(txtRate.getText() == null || txtHour.getText() == null)
				{
					wage.setText("Not enough information provided");
				}
			}
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
