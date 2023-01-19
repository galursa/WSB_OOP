import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame implements ActionListener{
	JTextField percent;
	JTextField value;
	JButton btn = new JButton("Calculate");
	JLabel result;
	public Frame()
	{
		super("Percentage calculation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 150);
 		setLocation(300,300);	
 		setLayout(new FlowLayout());
 		percent = new JTextField(5);
 		add(percent);
 		JLabel info = new JLabel("% of ");
 		add(info);
 		value = new JTextField(5);
 		add(value);
 		add(btn);
 		result = new JLabel(" ");
 		add(result);
 		setVisible(true);
 		btn.addActionListener((ActionListener) this);
	}
	public void actionPerformed(ActionEvent e)
	{
		 if (e.getSource() == btn) {
			    String percentage  = percent.getText();
			    String valueRead  = value.getText();
			    double percentageDouble = Double.parseDouble(percentage);
			    double valueDouble = Double.parseDouble(valueRead);
			    double resultValue = percentageDouble/100*valueDouble;
	        	String resultString = String.valueOf(resultValue);
	        	result.setText(resultString);
	        } 
	}

}
