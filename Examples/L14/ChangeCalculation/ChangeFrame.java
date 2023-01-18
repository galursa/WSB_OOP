import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChangeFrame extends JFrame implements ActionListener{ 
	JTextField typeText;
	JTextField typeTextRad;
	JButton btnChange = new JButton("Change");
	JButton btnChangeRad = new JButton("Change");
	JLabel result;
	JLabel resultRad;
	public ChangeFrame() {
		super("Changing from degrees to radians");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 150);
 		setLocation(300,300);	
 		setLayout(new FlowLayout());
 		add(new JLabel("Write degree:"));
 		typeText = new JTextField(10);
 		add(typeText);
 		add(btnChange);
 		result = new JLabel("  ");
 		add(result);
 		add(new JLabel("Write radian:"));
 		typeTextRad= new JTextField(10);
 		add(typeTextRad);
 		add(btnChangeRad);
 		resultRad = new JLabel("  ");
 		add(resultRad);
 		setVisible(true);
 		btnChange.addActionListener((ActionListener) this);
 		btnChangeRad.addActionListener((ActionListener) this);
	}
	public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnChange) {
        	String valueInDegree = typeText.getText();
        	double valueInRadian = Double.parseDouble(valueInDegree);
        	valueInRadian = valueInRadian * Math.PI / 180;
        	String resultValue = "In radians: "+String.valueOf(valueInRadian);
        	result.setText(resultValue);
        } 
        if (e.getSource() == btnChangeRad) {
        	String valueInRadian = typeTextRad.getText();
        	double valueInDegree = Double.parseDouble(valueInRadian);
        	valueInDegree = valueInDegree * 180 / Math.PI;
        	String resultValue = "In degrees: "+String.valueOf(valueInDegree);
        	resultRad.setText(resultValue);
        	//resultRad.setText("abc");
        }
        
    }
}
