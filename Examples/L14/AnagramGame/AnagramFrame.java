import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class AnagramFrame extends JFrame implements ActionListener{
	JLabel wordToGuess;
	JTextField word;
	JButton btn = new JButton("Check");
	String [] wordList = new String [4];
	int nrOfWrd;
	JLabel result;
	public AnagramFrame() 
	{
		super("Anagram Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,200);
		setLocation(300, 150);
		setLayout(new FlowLayout());
		
		wordList[0] = "computer";
		wordList[1] = "mouse";
		wordList[2] = "screen";
		wordList[3] = "keyboard";
		
		Random rnd = new Random();
		nrOfWrd = rnd.nextInt(4);
		String wrdToPrint1 = wordList[nrOfWrd].substring(0, 2);
		String wrdToPrint2= wordList[nrOfWrd].substring(2, wordList[nrOfWrd].length());
		wrdToPrint2 +=wrdToPrint1;
		wordToGuess = new JLabel(wrdToPrint2);
		add(wordToGuess);
		add(new JLabel(" = "));
		word = new JTextField(15);
		add(word);
		add(btn);	
		result = new JLabel("   ");
		add(result);
		btn.addActionListener((ActionListener) this);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btn)
		{
			String userWord = word.getText();
			//instead of loop we can use equals method
			
			if(userWord.equals(wordList[nrOfWrd]))
			{
				result.setText("Good work");
			} else
			{
				result.setText("Try Again");
			}
		}
		
	}
}
