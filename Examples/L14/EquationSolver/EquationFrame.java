import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EquationFrame extends JFrame implements ActionListener{
	JTextField value1;
	JTextField value2;
	JTextField value3;
	JButton btnSolve = new JButton("Calculate"); 
	JLabel result;
	public EquationFrame()
	{
		super("Equation solver");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,200);
		setLocation(300, 150);
		setLayout(new FlowLayout());
		value1 = new JTextField(5);
		add(value1);
		JLabel label1 = new JLabel("x+(");
		add(label1);
		value2 = new JTextField(5);
		add(value2);
		JLabel label2 = new JLabel(")=");
		add(label2);
		value3 = new JTextField(5);
		add(value3);
		add(btnSolve);
		btnSolve.addActionListener((ActionListener) this);
		result = new JLabel("x= ");
		add(result);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnSolve)
		{
			double v1 = Double.parseDouble(value1.getText());
			double v2 = Double.parseDouble(value2.getText());
			double v3 = Double.parseDouble(value3.getText());
			double x = (v3-v2)/v1;
			result.setText(String.valueOf(x));
			
		}
	}
}
