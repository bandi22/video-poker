package videopoker;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class textDisplay extends JTextArea {
	
public textDisplay() 
{
	super("SORRY\nNO WINS", 1, 1);
	this.setBorder(BorderFactory.createLineBorder(Color.RED, 4));
	this.setVisible(true);
	this.setSize(100, 100);
	this.setBackground(Color.CYAN);
	this.setForeground(Color.RED);
	this.setFont(new Font("Consolas", Font.BOLD, 18));
	this.setLocation(300, 200);
	this.setEditable(false);
	
}

protected void setText(Combo combo) 
{
	
	switch (combo) 
	{
		case JACKS_OR_BETTER :
			this.setText("JACKS OR BETTER PAIR!" + "\nYOU WON: " + (Game.multiplier * Game.bet));
			break;
		case TWO_PAIR :
			this.setText("TWO PAIR!" + "\nYOU WON: " + (Game.multiplier * Game.bet));
			break;
		case THREE_OF_A_KIND :
			this.setText("3 OF A KIND!" + "\nYOU WON: " + (Game.multiplier * Game.bet));
			break;
		case STRAIGHT :
			this.setText("STRAIGHT" + "\nYOU WON: " + (Game.multiplier * Game.bet));
			break;
		case FLUSH :
			this.setText("FLUSH!" + "\nYOU WON: " + (Game.multiplier * Game.bet));
			break;
		case FULL_HOUSE :
			this.setText("FULL HOUSE!" + "\nYOU WON: " + (Game.multiplier * Game.bet));
			break;
		case FOUR_OF_A_KIND :
			this.setText("4 OF A KIND!" + "\nYOU WON: " + (Game.multiplier * Game.bet));
			break;
		case STRAIGHT_FLUSH :
			this.setText("STRAIGHT FLUSH!" + "\nYOU WON: " + (Game.multiplier * Game.bet));
			break;
		case ROYAL_FLUSH :
			this.setText("*** ROYAL FLUSH ***" + "\nJACKPOT: " + (Game.multiplier * Game.bet));
			break;
		case HIGH_CARD :
			this.setText("SORRY!\nNO WINS");
			break;
	
	}//switch
	
}//setText()

}
