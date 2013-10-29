import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class GuessResultPanel extends JPanel{
	private JTextField displayResult;
	public GuessResultPanel() {
		
		displayResult= new JTextField(10);
		setBorder(new TitledBorder (new EtchedBorder(), "Guess Result"));
		JLabel gResult= new JLabel("Response");
		add(gResult);
		add(displayResult);
	}

}
