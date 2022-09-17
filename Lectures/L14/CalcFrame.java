import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalcFrame extends JFrame implements ActionListener{
	JTextField typeText;
	JButton btn = new JButton("Calculate"); 
	JComboBox cb;
	JLabel result;
	public CalcFrame() {
		super("Multiplication");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
 		setLocation(300,300);	
 		setLayout(new FlowLayout());
 		typeText = new JTextField(15);
 		add(typeText);
 		add(new JLabel("*"));
 		String numbers[] = {"1","2","3","4","5"};
 		cb =new JComboBox(numbers);    
 	    cb.setBounds(50,50,90,20);    
 	    add(cb);      
 	    add(new JLabel("="));
 	    result =new JLabel("   ");
 	    add(result);
 		add(btn);
        btn.addActionListener((ActionListener) this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btn) {
            String number = typeText.getText(); 
            String multiplier = cb.getSelectedItem().toString();
            int l = Integer.parseInt(number);
            int m = Integer.parseInt(multiplier);
            m*=l;
            String w = String.valueOf(m); 
            result.setText(w);
        }
    }

}