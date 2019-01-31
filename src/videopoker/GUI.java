package videopoker;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GUI {
	
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
	
	JFrame frame = new JFrame("Jacks or Better 9/6 Video Poker");
	JPanel panel = new JPanel();
	
	JButton hold1 = new JButton("HOLD");
	JButton hold2 = new JButton("HOLD");
	JButton hold3 = new JButton("HOLD");
	JButton hold4 = new JButton("HOLD");
	JButton hold5 = new JButton("HOLD");
	JButton dealButton = new JButton("DRAW");
	
	JTextArea handList = new JTextArea();
	
	JLabel creditsLabel = new JLabel("CREDITS:");
	JLabel credits = new JLabel();
	
	PictureBox pbCard1 = new PictureBox();
	PictureBox pbCard2 = new PictureBox();
	PictureBox pbCard3 = new PictureBox();
	PictureBox pbCard4 = new PictureBox();
	PictureBox pbCard5 = new PictureBox();
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setSize(800,600);
	frame.setLocationRelativeTo(null);
	frame.add(panel);
	panel.setLayout(null);
	
	/*** PANEL COMPONENTS ***/
	
	panel.add(hold1);
	panel.add(hold2);
	panel.add(hold3);
	panel.add(hold4);
	panel.add(hold5);
	panel.add(dealButton);
	panel.add(pbCard1);
	panel.add(pbCard2);
	panel.add(pbCard3);
	panel.add(pbCard4);
	panel.add(pbCard5);
	panel.add(handList);
	panel.add(creditsLabel);
	panel.add(credits);
	
	panel.setBackground(Color.BLUE);
	
	/*** BUTTONS ***/
	
	hold1.setSize(80, 30);
	hold2.setSize(80, 30);
	hold3.setSize(80, 30);
	hold4.setSize(80, 30);
	hold5.setSize(80, 30);
	dealButton.setSize(80,60);
	
	hold1.setLocation(30, 530);
	hold2.setLocation(160, 530);
	hold3.setLocation(290, 530);
	hold4.setLocation(420, 530);
	hold5.setLocation(550, 530);
	dealButton.setLocation(680,350);
	
	dealButton.setForeground(Color.RED);
	
	/*** TEXT COMPONENTS ***/
	
	creditsLabel.setForeground(Color.YELLOW);
	creditsLabel.setFont(new Font("Sans Serif", Font.BOLD, 16));
	creditsLabel.setSize(80, 40);
	creditsLabel.setLocation(680, 420);
	
	credits.setForeground(Color.YELLOW);
	credits.setFont(new Font("Consolas", Font.BOLD, 16));
	credits.setText(Integer.toString(Game.credits) + "$");
	credits.setSize(80, 40);
	credits.setLocation(680, 440);
	
	handList.setLocation(10, 10);
	handList.setEditable(false);
	handList.setFocusable(false);
	handList.setOpaque(true);
	handList.setSize(300, 220);
	handList.setBackground(Color.BLUE);
	handList.setForeground(Color.YELLOW);
	handList.setFont(new Font("Consolas", Font.BOLD, 20));
	handList.setText("ROYAL FLUSH\n\nSTRAIGHT FLUSH\n4 OF A KIND\nFULL HOUSE\nFLUSH\n3 OF A KIND\nTWO PAIR\nJACKS OR BETTER");
	
	/*** IMAGE COMPONENTS ***/
	
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
	
	
	/*** EVENT HANDLERS ***/
	
	dealButton.addActionListener(new ActionListener() 
	{

		@Override
		public void actionPerformed(ActionEvent ae) {
			
		Deck currentDeck = new Deck();
		ArrayList<Card> hand = currentDeck.deal();
	
		pbCard1.setCardImage(hand.get(0));
		pbCard2.setCardImage(hand.get(1));
		pbCard3.setCardImage(hand.get(2));
		pbCard4.setCardImage(hand.get(3));
		pbCard5.setCardImage(hand.get(4));
			
		}
		
	});//dealButton.addActionListener
	
}//buildGUI method


} //GUI class
