package videopoker;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class TextDisplay extends JTextPane {
	
public TextDisplay() 
{
	super();
	this.setText("NO WINS");
	this.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 4));
	this.setVisible(true);
	this.setSize(300, 70);
	this.setBackground(Color.BLUE);
	this.setForeground(Color.YELLOW);
	this.setFont(new Font("Consolas", Font.BOLD, 20));
	this.setLocation(250, 265);
	this.setEditable(false);
	
	StyledDocument style = this.getStyledDocument();
	SimpleAttributeSet c = new SimpleAttributeSet();
	StyleConstants.setAlignment(c, StyleConstants.ALIGN_CENTER);
	style.setParagraphAttributes(0, style.getLength(), c, false);
	
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
