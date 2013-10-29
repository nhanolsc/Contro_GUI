import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.*;


public class ClueGame_ControlGUI extends JFrame{
	
	
	public Component createNorthLayout(){
		JPanel panel= new JPanel();
		panel.setLayout(new GridLayout(1,3));
		whoseTurnPanel wtPanel= new whoseTurnPanel();
		panel.add(wtPanel);
		buttonsPanel bPanel= new buttonsPanel();
		panel.add(bPanel);
		return panel;
		
	}
	public Component createSouthLayout(){
		JPanel panel= new JPanel();
		panel.setLayout(new GridLayout(1,3));
		DiePanel dPanel= new DiePanel();
		panel.add(dPanel);
		GuessPanel gPanel= new GuessPanel();
		panel.add(gPanel);
		GuessResultPanel gResult= new GuessResultPanel();
		panel.add(gResult);
		return panel;
	}
	public ClueGame_ControlGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle ("Clue Game Contrl GUI");
		setSize (700,200);
		
		add(createNorthLayout(), BorderLayout.NORTH);
		add(createSouthLayout(), BorderLayout.SOUTH);
		
		
		
	}
	public static void main(String[] args) {
		ClueGame_ControlGUI gui= new ClueGame_ControlGUI();
		
		gui.setVisible (true);
	}

}
