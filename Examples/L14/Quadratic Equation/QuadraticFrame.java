import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class QuadraticFrame extends JFrame implements ActionListener{
	JTextField a;
	JTextField b;
	JTextField c;
	JButton btn = new JButton("Calculate"); 
	JLabel result;
	QuadraticFrame(){
		super("Quadratic equation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 150);
 		setLocation(300,300);	
 		setLayout(new FlowLayout());
 		add(new JLabel("y="));
 		a = new JTextField(3);
 		add(a);
 		add(new JLabel("*x^2+"));
 		b = new JTextField(3);
 		add(b);
 		add(new JLabel("*x+"));
 		c = new JTextField(3);
 		add(c);
 		add(btn);
 		result = new JLabel(" ");
 		add(result);
 		btn.addActionListener((ActionListener) this);
 		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		 if (e.getSource() == btn) {
			 String aStr = a.getText(); 
			 String bStr = b.getText(); 
			 String cStr = c.getText(); 
			 double a = Double.parseDouble(aStr);
			 double b = Double.parseDouble(bStr);
			 double c = Double.parseDouble(cStr);
			 double delta = b*b-4*a*c;
			 String result;
			 double x1,x2;
			 if(delta<0)
			 {
				 result="Equation does not have any roots";
			 }else if(delta==0) {
				 x1 = -b/(2*a);
				 result="Delta = 0, therefore we have one root: x0 = "+x1;
			 }else {
				 x1=(-b+Math.sqrt(delta))/(2*a);
				 x2=(-b-Math.sqrt(delta))/(2*a);
				 result="We have two roots: x1 = "+String.valueOf(x1)+", x2 = "+String.valueOf(x2);
			 }
			 this.result.setText(result);
		 }
	}
}
