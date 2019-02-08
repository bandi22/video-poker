/** Author: Andras Szabo (2019)
 * Jacks Or Better 9/6 Video Poker application written with Swing components
 * =========================================================================
 * Card textures are from OpenGameArt (https://opengameart.org)
 * https://opengameart.org/content/colorful-poker-card-back (author: jeffshee) (CC-BY 3.0 License) 
 * https://opengameart.org/content/playing-cards-vector-png (author: Byron Knoll) (Public Domain CC0)
 * ====================================================================================================
 * **/

package videopoker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;

public class GUI {
	
	static Deck currentDeck = new Deck();
	static Card[] hand;
	
public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() 
			{
				buildGUI();
			}
			
		});

	} //main

public static void buildGUI() 
{
	
	/** DECLARING SWING COMPONENTS **/
	
	JFrame frame = new JFrame("Jacks or Better 9/6 Video Poker");
	JPanel panel = new JPanel();
	
	JButton hold1 = new JButton("HOLD");
	JButton hold2 = new JButton("HOLD");
	JButton hold3 = new JButton("HOLD");
	JButton hold4 = new JButton("HOLD");
	JButton hold5 = new JButton("HOLD");
	JButton dealButton = new JButton("DEAL");
	JButton betOne = new JButton("BET ONE");
	JButton betMax = new JButton("BET MAX");
	
	JTextArea handList = new JTextArea();
	JTextArea multi1 = new JTextArea();
	JTextArea multi2 = new JTextArea();
	JTextArea multi3 = new JTextArea();
	JTextArea multi4 = new JTextArea();
	JTextArea multi5 = new JTextArea();
	
	JTextArea strip1 = new JTextArea();
	JTextArea strip2 = new JTextArea();
	JTextArea strip3 = new JTextArea();
	JTextArea strip4 = new JTextArea();
	JTextArea strip5 = new JTextArea();
	JTextArea strip6 = new JTextArea();
	
	JLabel creditsLabel = new JLabel("CREDITS:");
	JLabel credits = new JLabel();
	JLabel betsLabel = new JLabel("BET:");
	JLabel bets = new JLabel();
	TextDisplay wins = new TextDisplay();
	
	PictureBox pbCard1 = new PictureBox();
	PictureBox pbCard2 = new PictureBox();
	PictureBox pbCard3 = new PictureBox();
	PictureBox pbCard4 = new PictureBox();
	PictureBox pbCard5 = new PictureBox();
	
	/** MAIN FRAME SETTINGS **/
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setSize(800,600);
	frame.setLocationRelativeTo(null);
	frame.add(panel);
	panel.setLayout(null);
	
	/** PANEL COMPONENTS **/
	
	panel.add(hold1);
	panel.add(hold2);
	panel.add(hold3);
	panel.add(hold4);
	panel.add(hold5);
	panel.add(dealButton);
	panel.add(betOne);
	panel.add(betMax);
	panel.add(pbCard1);
	panel.add(pbCard2);
	panel.add(pbCard3);
	panel.add(pbCard4);
	panel.add(pbCard5);
	panel.add(handList);
	panel.add(creditsLabel);
	panel.add(credits);
	panel.add(bets);
	panel.add(betsLabel);
	panel.add(wins);
	panel.add(multi1);
	panel.add(multi2);
	panel.add(multi3);
	panel.add(multi4);
	panel.add(multi5);
	handList.add(strip1);
	multi1.add(strip2);
	multi2.add(strip3);
	multi3.add(strip4);
	multi4.add(strip5);
	multi5.add(strip6);
	
	panel.setBackground(Color.BLUE);
	
	/** BUTTONS **/
	
	hold1.setSize(80,30);
	hold2.setSize(80,30);
	hold3.setSize(80,30);
	hold4.setSize(80,30);
	hold5.setSize(80,30);
	dealButton.setSize(90,60);
	betOne.setSize(90,40);
	betMax.setSize(90,40);
	
	hold1.setLocation(30,530);
	hold2.setLocation(160,530);
	hold3.setLocation(290,530);
	hold4.setLocation(420,530);
	hold5.setLocation(550,530);
	dealButton.setLocation(680,460);
	betOne.setLocation(680,400);
	betMax.setLocation(680,350);
	
	dealButton.setEnabled(false);
	hold1.setEnabled(false);
	hold2.setEnabled(false);
	hold3.setEnabled(false);
	hold4.setEnabled(false);
	hold5.setEnabled(false);
	
	hold1.setFocusable(false);
	hold2.setFocusable(false);
	hold3.setFocusable(false);
	hold4.setFocusable(false);
	hold5.setFocusable(false);
	dealButton.setFocusable(false);
	betOne.setFocusable(false);
	betMax.setFocusable(false);
	
	dealButton.setBackground(new Color(238,238,238));
	dealButton.setForeground(Color.RED);
	
	hold1.setForeground(new Color(51,51,51));
	hold1.setBackground(new Color(238,238,238));
	hold2.setForeground(new Color(51,51,51));
	hold2.setBackground(new Color(238,238,238));
	hold3.setForeground(new Color(51,51,51));
	hold3.setBackground(new Color(238,238,238));
	hold4.setForeground(new Color(51,51,51));
	hold4.setBackground(new Color(238,238,238));
	hold5.setForeground(new Color(51,51,51));
	hold5.setBackground(new Color(238,238,238));
	betOne.setForeground(new Color(51,51,51));
	betOne.setBackground(new Color(238,238,238));
	betMax.setForeground(new Color(51,51,51));
	betMax.setBackground(new Color(238,238,238));
	
	/** TEXT COMPONENTS **/
	
	Font labelFont = new Font("Consolas", Font.BOLD, 20);
	
	creditsLabel.setForeground(Color.YELLOW);
	creditsLabel.setFont(labelFont);
	creditsLabel.setSize(90, 40);
	creditsLabel.setLocation(20, 300);
	
	credits.setForeground(Color.YELLOW);
	credits.setFont(labelFont);
	credits.setText(Integer.toString(Game.credits));
	credits.setSize(120, 40);
	credits.setLocation(115, 300);
	
	betsLabel.setForeground(Color.YELLOW);
	betsLabel.setFont(labelFont);
	betsLabel.setSize(90, 40);
	betsLabel.setLocation(20, 270);
	
	bets.setForeground(Color.YELLOW);
	bets.setFont(labelFont);
	bets.setText(Integer.toString(Game.bet));
	bets.setSize(120, 40);
	bets.setLocation(115, 270);
	
	wins.setVisible(false);
	
	handList.setLocation(20, 10);
	handList.setEditable(false);
	handList.setFocusable(false);
	handList.setSize(180, 240);
	handList.setBackground(Color.BLUE);
	handList.setForeground(Color.YELLOW);
	handList.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	handList.setFont(labelFont);
	handList.setText(
			"ROYAL FLUSH.....\n\n"
			+ "STRAIGHT FLUSH..\n"
			+ "4 OF A KIND.....\n"
			+ "FULL HOUSE......\n"
			+ "FLUSH...........\n"
			+ "STRAIGHT........\n"
			+ "3 OF A KIND.....\n"
			+ "TWO PAIR........\n"
			+ "JACKS OR BETTER.");
	
	multi1.setSize(115, 240);
	multi1.setLocation(200,10);
	multi1.setBackground(Color.BLUE);
	multi1.setForeground(Color.YELLOW);
	multi1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	multi1.setFont(labelFont);
	multi1.setFocusable(false);
	multi1.setEditable(false);
	multi1.setText("       250\n\n"
			+ "        50\n"
			+ "        25\n"
			+ "         9\n"
			+ "         6\n"
			+ "         4\n"
			+ "         3\n"
			+ "         2\n"
			+ "         1");
	
	multi2.setSize(115,240);
	multi2.setLocation(315,10);
	multi2.setBackground(Color.BLUE);
	multi2.setForeground(Color.YELLOW);
	multi2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	multi2.setFont(labelFont);
	multi2.setFocusable(false);
	multi2.setEditable(false);
	multi2.setText("       500\n\n"
			+ "       100\n"
			+ "        50\n"
			+ "        18\n"
			+ "        12\n"
			+ "         8\n"
			+ "         6\n"
			+ "         4\n"
			+ "         2");
	
	multi3.setSize(115,240);
	multi3.setLocation(430,10);
	multi3.setBackground(Color.BLUE);
	multi3.setForeground(Color.YELLOW);
	multi3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	multi3.setFont(labelFont);
	multi3.setFocusable(false);
	multi3.setEditable(false);
	multi3.setText("       750\n\n"
			+ "       150\n"
			+ "        75\n"
			+ "        27\n"
			+ "        18\n"
			+ "        12\n"
			+ "         9\n"
			+ "         6\n"
			+ "         3");
	
	multi4.setSize(115,240);
	multi4.setLocation(545,10);
	multi4.setBackground(Color.BLUE);
	multi4.setForeground(Color.YELLOW);
	multi4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	multi4.setFont(labelFont);
	multi4.setFocusable(false);
	multi4.setEditable(false);
	multi4.setText("      1000\n\n"
			+ "       200\n"
			+ "       100\n"
			+ "        36\n"
			+ "        24\n"
			+ "        16\n"
			+ "        12\n"
			+ "        8\n"
			+ "        4");
	
	multi5.setSize(115,240);
	multi5.setLocation(660,10);
	multi5.setBackground(Color.BLUE);
	multi5.setForeground(Color.YELLOW);
	multi5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	multi5.setFont(labelFont);
	multi5.setFocusable(false);
	multi5.setEditable(false);
	multi5.setText("      4000\n\n"
			+ "       250\n"
			+ "       125\n"
			+ "        45\n"
			+ "        30\n"
			+ "        20\n"
			+ "        15\n"
			+ "        10\n"
			+ "         5");
	
	
	/***IMAGE COMPONENTS **/
	
	pbCard1.setLocation(10, 350);
	pbCard1.setVisible(true);
	pbCard1.setSize(118, 170);
	
	pbCard2.setLocation(140, 350);
	pbCard2.setVisible(true);
	pbCard2.setSize(118, 170);
	
	pbCard3.setLocation(270, 350);
	pbCard3.setVisible(true);
	pbCard3.setSize(118, 170);
	
	pbCard4.setLocation(400, 350);
	pbCard4.setVisible(true);
	pbCard4.setSize(118, 170);
	
	pbCard5.setLocation(530, 350);
	pbCard5.setVisible(true);
	pbCard5.setSize(118, 170);
	
	strip1.setSize(180, 24);
	strip1.setLocation(0, 120);
	strip1.setEditable(false);
	strip1.setFocusable(false);
	strip1.setVisible(false);
	strip1.setBackground(new Color(1F,0F,0F,.4F));
	
	strip2.setSize(180, 24);
	strip2.setLocation(0, 120);
	strip2.setEditable(false);
	strip2.setFocusable(false);
	strip2.setVisible(false);
	strip2.setBackground(new Color(1F,0F,0F,.4F));
	
	strip3.setSize(180, 24);
	strip3.setLocation(0, 120);
	strip3.setEditable(false);
	strip3.setFocusable(false);
	strip3.setVisible(false);
	strip3.setBackground(new Color(1F,0F,0F,.4F));
	
	strip4.setSize(180, 24);
	strip4.setLocation(0, 120);
	strip4.setEditable(false);
	strip4.setFocusable(false);
	strip4.setVisible(false);
	strip4.setBackground(new Color(1F,0F,0F,.4F));
	
	strip5.setSize(180, 24);
	strip5.setLocation(0, 120);
	strip5.setEditable(false);
	strip5.setFocusable(false);
	strip5.setVisible(false);
	strip5.setBackground(new Color(1F,0F,0F,.4F));
	
	strip6.setSize(180, 24);
	strip6.setLocation(0, 120);
	strip6.setEditable(false);
	strip6.setFocusable(false);
	strip6.setVisible(false);
	strip6.setBackground(new Color(1F,0F,0F,.4F));
	
	
	/** EVENT HANDLERS **/
	
	/* TEST HAND */
	/*
	Card[] testHand = new Card[5];
	testHand[0] = new Card(Rank.Ten, Suit.Hearts);
	testHand[1] = new Card(Rank.Jack, Suit.Hearts);
	testHand[2] = new Card(Rank.Queen, Suit.Hearts);
	testHand[3] = new Card(Rank.King, Suit.Hearts);
	testHand[4] = new Card(Rank.Ace, Suit.Hearts);
	*/
	
	// Draw cards button
	dealButton.addActionListener(new ActionListener() 
	{

		@Override
		public void actionPerformed(ActionEvent ae) {
			
		switch (Game.round) {
		
		case 0:			
			hand = currentDeck.deal();
			//hand = testHand;
			
			betOne.setEnabled(false);
			betMax.setEnabled(false);
			
			dealButton.setText("DRAW");
		
			pbCard1.setCardImage(hand[0]);
			pbCard2.setCardImage(hand[1]);
			pbCard3.setCardImage(hand[2]);
			pbCard4.setCardImage(hand[3]);
			pbCard5.setCardImage(hand[4]);
			
			hold1.setEnabled(true);
			hold2.setEnabled(true);
			hold3.setEnabled(true);
			hold4.setEnabled(true);
			hold5.setEnabled(true);
			
			GUI.setDisplay(Evaluator.checkHand(hand), strip1);
			GUI.setDisplay(Evaluator.checkHand(hand), strip2);
			GUI.setDisplay(Evaluator.checkHand(hand), strip3);
			GUI.setDisplay(Evaluator.checkHand(hand), strip4);
			GUI.setDisplay(Evaluator.checkHand(hand), strip5);
			GUI.setDisplay(Evaluator.checkHand(hand), strip6);
			
			Game.round++;
		break;
		
		case 1:
			hand = currentDeck.dealSecond(hand);
			//hand = testHand;
			
			pbCard1.setCardImage(hand[0]);
			pbCard2.setCardImage(hand[1]);
			pbCard3.setCardImage(hand[2]);
			pbCard4.setCardImage(hand[3]);
			pbCard5.setCardImage(hand[4]);
			
			//Evaluator.checkHand(hand);
			
			GUI.setDisplay(Evaluator.checkHand(hand), strip1);
			GUI.setDisplay(Evaluator.checkHand(hand), strip2);
			GUI.setDisplay(Evaluator.checkHand(hand), strip3);
			GUI.setDisplay(Evaluator.checkHand(hand), strip4);
			GUI.setDisplay(Evaluator.checkHand(hand), strip5);
			GUI.setDisplay(Evaluator.checkHand(hand), strip6);
			
			/* TEST LOOP
			 * 
				for (int i = 0; i < hand.length; i++) 
				{
					System.out.println("++ " + hand[i].getName() + " ++");
				}
				
				System.out.println("***********************");
				System.out.println(Evaluator.checkHand(hand));
				
			*/
			
			wins.setText(Evaluator.checkHand(hand));
			wins.setVisible(true);
			
			Game.round++;
			
			dealButton.setText("DEAL");
			
		break;
		
		case 2:
			
			Game.credits += (Game.multiplier * Game.bet);
			
			dealButton.setText("DEAL");
			Game.round = 0;
			Game.bet = 0;
			Game.multiplier = 0;
			
			for (int i = 0; i < hand.length; i++) 
			{
				hand[i].held = false;
			}
			
			pbCard1.resetCardImage(hand[0]);
			pbCard2.resetCardImage(hand[1]);
			pbCard3.resetCardImage(hand[2]);
			pbCard4.resetCardImage(hand[3]);
			pbCard5.resetCardImage(hand[4]);
			
			Arrays.fill(hand, null);
			
			hold1.setText("HOLD");
			hold1.setForeground(new Color(51,51,51));
			hold1.setBackground(new Color(238,238,238));
			hold1.repaint();
			
			hold2.setText("HOLD");
			hold2.setForeground(new Color(51,51,51));
			hold2.setBackground(new Color(238,238,238));
			hold2.repaint();
			
			hold3.setText("HOLD");
			hold3.setForeground(new Color(51,51,51));
			hold3.setBackground(new Color(238,238,238));
			hold3.repaint();
			
			hold4.setText("HOLD");
			hold4.setForeground(new Color(51,51,51));
			hold4.setBackground(new Color(238,238,238));
			hold4.repaint();
			
			hold5.setText("HOLD");
			hold5.setForeground(new Color(51,51,51));
			hold5.setBackground(new Color(238,238,238));
			hold5.repaint();
			
			multi1.setBackground(Color.BLUE);
			multi2.setBackground(Color.BLUE);
			multi3.setBackground(Color.BLUE);
			multi4.setBackground(Color.BLUE);
			multi5.setBackground(Color.BLUE);
			
			dealButton.setEnabled(false);
			hold1.setEnabled(false);
			hold2.setEnabled(false);
			hold3.setEnabled(false);
			hold4.setEnabled(false);
			hold5.setEnabled(false);
			
			bets.setText(Integer.toString(Game.bet));
			credits.setText(Integer.toString(Game.credits));
			
			betOne.setEnabled(true);
			betMax.setEnabled(true);
			
			wins.setVisible(false);
			strip1.setVisible(false);
			strip2.setVisible(false);
			strip3.setVisible(false);
			strip4.setVisible(false);
			strip5.setVisible(false);
			strip6.setVisible(false);
			
		break;
		}//switch
		
		}
		
	});//dealButton.addActionListener
	
	//Hold cards buttons
	
	hold1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent ae) {
			
			if (hand[0].held == false) 
			{
				hand[0].held = true;
				hold1.setText("HELD");
				hold1.setForeground(Color.ORANGE);
				hold1.setBackground(Color.RED);
				hold1.repaint();
			}
			
			else if (hand[0].held == true) 
			{
				hand[0].held = false;
				hold1.setText("HOLD");
				hold1.setForeground(new Color(51,51,51));
				hold1.setBackground(new Color(238,238,238));
				hold1.repaint();
			}
		}
	}); //Hold 1st card buttons
	
	hold2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent ae) {
			
			if (hand[1].held == false) 
			{
				hand[1].held = true;
				hold2.setText("HELD");
				hold2.setForeground(Color.ORANGE);
				hold2.setBackground(Color.RED);
				hold2.repaint();
			}
			
			else if (hand[1].held == true) 
			{
				hand[1].held = false;
				hold2.setText("HOLD");
				hold2.setForeground(new Color(51,51,51));
				hold2.setBackground(new Color(238,238,238));
				hold2.repaint();
			}

		}
	}); //Hold 2nd card buttons
	
	hold3.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent ae) {
			
			if (hand[2].held == false) 
			{
				hand[2].held = true;
				hold3.setText("HELD");
				hold3.setForeground(Color.ORANGE);
				hold3.setBackground(Color.RED);
				hold3.repaint();
			}
			
			else if (hand[2].held == true) 
			{
				hand[2].held = false;
				hold3.setText("HOLD");
				hold3.setForeground(new Color(51,51,51));
				hold3.setBackground(new Color(238,238,238));
				hold3.repaint();
			}
		}
	}); //Hold 3rd card buttons
	
	hold4.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent ae) {
			
			if (hand[3].held == false) 
			{
				hand[3].held = true;
				hold4.setText("HELD");
				hold4.setForeground(Color.ORANGE);
				hold4.setBackground(Color.RED);
				hold4.repaint();
			}
			
			else if (hand[3].held == true) 
			{
				hand[3].held = false;
				hold4.setText("HOLD");
				hold4.setForeground(new Color(51,51,51));
				hold4.setBackground(new Color(238,238,238));
				hold4.repaint();
			}
			
		}
	}); //Hold 4th card buttons
	
	hold5.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent ae) {
			
			if (hand[4].held == false) 
			{
				hand[4].held = true;
				hold5.setText("HELD");
				hold5.setForeground(Color.ORANGE);
				hold5.setBackground(Color.RED);
				hold5.repaint();
			}
			
			else if (hand[4].held == true) 
			{
				hand[4].held = false;
				hold5.setText("HOLD");
				hold5.setForeground(new Color(51,51,51));
				hold5.setBackground(new Color(238,238,238));
				hold5.repaint();
			}
			
		}
	}); //Hold 5th card buttons
	
	betOne.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent ae) {
			
			
			if (Game.credits > 0) {
				
				dealButton.setEnabled(true);
			
				if (Game.bet <= 5) 
				{
					Game.bet++;
				}
				
				switch (Game.bet) 
				{
				
				case 1: 
					multi1.setBackground(Color.RED);
					Game.credits--;
				break;
				
				case 2: 
					multi1.setBackground(Color.BLUE);
					multi2.setBackground(Color.RED);
					Game.credits--;
				break;
				
				case 3: 
					multi1.setBackground(Color.BLUE);
					multi2.setBackground(Color.BLUE);
					multi3.setBackground(Color.RED);
					Game.credits--;
				break;
				
				case 4:
					multi1.setBackground(Color.BLUE);
					multi2.setBackground(Color.BLUE);
					multi3.setBackground(Color.BLUE);
					multi4.setBackground(Color.RED);
					Game.credits--;
				break;
				
				case 5:
					multi1.setBackground(Color.BLUE);
					multi2.setBackground(Color.BLUE);
					multi3.setBackground(Color.BLUE);
					multi4.setBackground(Color.BLUE);
					multi5.setBackground(Color.RED);
					Game.credits--;
					
					betOne.setEnabled(false);
					betMax.setEnabled(false);
					
				break;
				} //switch
				
				bets.setText(Integer.toString(Game.bet));
				credits.setText(Integer.toString(Game.credits));
			
			}//if credits are not 0
			
			else 
			{
				System.out.println("GAME OVER!");
			}
		}
		
	}); //betOne button
	
	betMax.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (Game.credits > 4) {
				
				dealButton.setEnabled(true);
			
				multi1.setBackground(Color.BLUE);
				multi2.setBackground(Color.BLUE);
				multi3.setBackground(Color.BLUE);
				multi4.setBackground(Color.BLUE);
				multi5.setBackground(Color.RED);
				
				Game.bet = 5;
				Game.credits -= Game.bet;
				
				betOne.setEnabled(false);
				betMax.setEnabled(false);
			
			}//if credits are greater than 5
			
			else {
				System.out.println("NOT ENOUGH CREDITS!");
			}
			
			bets.setText(Integer.toString(Game.bet));
			credits.setText(Integer.toString(Game.credits));
		}
		
	});//betMax button
	
}//buildGUI() method


public static void setDisplay(Combo combo, JTextArea textArea) 
{
	
	switch (combo) 
	{
		case JACKS_OR_BETTER :
			textArea.setVisible(true);
			textArea.setLocation(0, 216);
			textArea.repaint();
			textArea.getParent().repaint();
			break;
		case TWO_PAIR :
			textArea.setVisible(true);
			textArea.setLocation(0, 192);
			textArea.repaint();
			textArea.getParent().repaint();
			break;
		case THREE_OF_A_KIND :
			textArea.setVisible(true);
			textArea.setLocation(0, 168);
			textArea.repaint();
			textArea.getParent().repaint();
			break;
		case STRAIGHT :
			textArea.setVisible(true);
			textArea.setLocation(0, 144);
			textArea.repaint();
			textArea.getParent().repaint();
			break;
		case FLUSH :
			textArea.setVisible(true);
			textArea.setLocation(0, 120);
			textArea.repaint();
			textArea.getParent().repaint();
			break;
		case FULL_HOUSE :
			textArea.setVisible(true);
			textArea.setLocation(0, 96);
			textArea.repaint();
			textArea.getParent().repaint();
			break;
		case FOUR_OF_A_KIND :
			textArea.setVisible(true);
			textArea.setLocation(0, 72);
			textArea.repaint();
			textArea.getParent().repaint();
			break;
		case STRAIGHT_FLUSH :
			textArea.setVisible(true);
			textArea.setLocation(0, 48);
			textArea.repaint();
			textArea.getParent().repaint();
			break;
		case ROYAL_FLUSH :
			textArea.setVisible(true);
			textArea.setLocation(0, 0);
			textArea.repaint();
			textArea.getParent().repaint();
			break;
		default :
			textArea.setVisible(false);
			break;
	}//switch
	
}//setDisplay() method

}//GUI class
