package videopoker;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PictureBox extends JPanel 
{
	private BufferedImage image;
	
	public PictureBox()
	{
		try 
		{
			image = ImageIO.read(getClass().getResource("/textures/default.jpg"));
		}
		
		catch (Exception ex) 
		{
			System.out.println("Image not found!");
		}
	}//constructor
	
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		g.drawImage(image,0,0,this);
	} //overriding paintComponent to call superclass method for rendering the BufferedImage
	
	public void setCardImage(Card card) 
	{
		try {
			
		/* CLUBS */
			
		if (card.rank == Rank.Two && card.suit == Suit.Clubs) 
		{
			image = ImageIO.read(getClass().getResource("/textures/2_of_clubs.jpg"));
		}
		
		else if (card.rank == Rank.Three && card.suit == Suit.Clubs) 
		{
			image = ImageIO.read(getClass().getResource("/textures/3_of_clubs.jpg"));
		}
		
		else if (card.rank == Rank.Four && card.suit == Suit.Clubs) 
		{
			image = ImageIO.read(getClass().getResource("/textures/4_of_clubs.jpg"));
		}
		
		else if (card.rank == Rank.Five && card.suit == Suit.Clubs) 
		{
			image = ImageIO.read(getClass().getResource("/textures/5_of_clubs.jpg"));
		}
		
		else if (card.rank == Rank.Six && card.suit == Suit.Clubs) 
		{
			image = ImageIO.read(getClass().getResource("/textures/6_of_clubs.jpg"));
		}
		
		else if (card.rank == Rank.Seven && card.suit == Suit.Clubs) 
		{
			image = ImageIO.read(getClass().getResource("/textures/7_of_clubs.jpg"));
		}
		
		else if (card.rank == Rank.Eight && card.suit == Suit.Clubs) 
		{
			image = ImageIO.read(getClass().getResource("/textures/8_of_clubs.jpg"));
		}
		
		else if (card.rank == Rank.Nine && card.suit == Suit.Clubs) 
		{
			image = ImageIO.read(getClass().getResource("/textures/9_of_clubs.jpg"));
		}
		
		else if (card.rank == Rank.Ten && card.suit == Suit.Clubs) 
		{
			image = ImageIO.read(getClass().getResource("/textures/10_of_clubs.jpg"));
		}
		
		else if (card.rank == Rank.Jack && card.suit == Suit.Clubs) 
		{
			image = ImageIO.read(getClass().getResource("/textures/jack_of_clubs.jpg"));
		}
		
		else if (card.rank == Rank.Queen && card.suit == Suit.Clubs) 
		{
			image = ImageIO.read(getClass().getResource("/textures/queen_of_clubs.jpg"));
		}
		
		else if (card.rank == Rank.King && card.suit == Suit.Clubs) 
		{
			image = ImageIO.read(getClass().getResource("/textures/king_of_clubs.jpg"));
		}
		
		else if (card.rank == Rank.Ace && card.suit == Suit.Clubs) 
		{
			image = ImageIO.read(getClass().getResource("/textures/ace_of_clubs.jpg"));
		}
		
		/* DIAMONDS */
		
		else if (card.rank == Rank.Two && card.suit == Suit.Diamonds) 
		{
			image = ImageIO.read(getClass().getResource("/textures/2_of_diamonds.jpg"));
		}
		
		else if (card.rank == Rank.Three && card.suit == Suit.Diamonds) 
		{
			image = ImageIO.read(getClass().getResource("/textures/3_of_diamonds.jpg"));
		}
		
		else if (card.rank == Rank.Four && card.suit == Suit.Diamonds) 
		{
			image = ImageIO.read(getClass().getResource("/textures/4_of_diamonds.jpg"));
		}
		
		else if (card.rank == Rank.Five && card.suit == Suit.Diamonds) 
		{
			image = ImageIO.read(getClass().getResource("/textures/5_of_diamonds.jpg"));
		}
		
		else if (card.rank == Rank.Six && card.suit == Suit.Diamonds) 
		{
			image = ImageIO.read(getClass().getResource("/textures/6_of_diamonds.jpg"));
		}
		
		else if (card.rank == Rank.Seven && card.suit == Suit.Diamonds) 
		{
			image = ImageIO.read(getClass().getResource("/textures/7_of_diamonds.jpg"));
		}
		
		else if (card.rank == Rank.Eight && card.suit == Suit.Diamonds) 
		{
			image = ImageIO.read(getClass().getResource("/textures/8_of_diamonds.jpg"));
		}
		
		else if (card.rank == Rank.Nine && card.suit == Suit.Diamonds) 
		{
			image = ImageIO.read(getClass().getResource("/textures/9_of_diamonds.jpg"));
		}
		
		else if (card.rank == Rank.Ten && card.suit == Suit.Diamonds) 
		{
			image = ImageIO.read(getClass().getResource("/textures/10_of_diamonds.jpg"));
		}
		
		else if (card.rank == Rank.Jack && card.suit == Suit.Diamonds) 
		{
			image = ImageIO.read(getClass().getResource("/textures/jack_of_diamonds.jpg"));
		}
		
		else if (card.rank == Rank.Queen && card.suit == Suit.Diamonds) 
		{
			image = ImageIO.read(getClass().getResource("/textures/queen_of_diamonds.jpg"));
		}
		
		else if (card.rank == Rank.King && card.suit == Suit.Diamonds) 
		{
			image = ImageIO.read(getClass().getResource("/textures/king_of_diamonds.jpg"));
		}
		
		else if (card.rank == Rank.Ace && card.suit == Suit.Diamonds) 
		{
			image = ImageIO.read(getClass().getResource("/textures/ace_of_diamonds.jpg"));
		}
		
		/* HEARTS */
		
		else if (card.rank == Rank.Two && card.suit == Suit.Hearts) 
		{
			image = ImageIO.read(getClass().getResource("/textures/2_of_hearts.jpg"));
		}
		
		else if (card.rank == Rank.Three && card.suit == Suit.Hearts) 
		{
			image = ImageIO.read(getClass().getResource("/textures/3_of_hearts.jpg"));
		}
		
		else if (card.rank == Rank.Four && card.suit == Suit.Hearts) 
		{
			image = ImageIO.read(getClass().getResource("/textures/4_of_hearts.jpg"));
		}
		
		else if (card.rank == Rank.Five && card.suit == Suit.Hearts) 
		{
			image = ImageIO.read(getClass().getResource("/textures/5_of_hearts.jpg"));
		}
		
		else if (card.rank == Rank.Six && card.suit == Suit.Hearts) 
		{
			image = ImageIO.read(getClass().getResource("/textures/6_of_hearts.jpg"));
		}
		
		else if (card.rank == Rank.Seven && card.suit == Suit.Hearts) 
		{
			image = ImageIO.read(getClass().getResource("/textures/7_of_hearts.jpg"));
		}
		
		else if (card.rank == Rank.Eight && card.suit == Suit.Hearts) 
		{
			image = ImageIO.read(getClass().getResource("/textures/8_of_hearts.jpg"));
		}
		
		else if (card.rank == Rank.Nine && card.suit == Suit.Hearts) 
		{
			image = ImageIO.read(getClass().getResource("/textures/9_of_hearts.jpg"));
		}
		
		else if (card.rank == Rank.Ten && card.suit == Suit.Hearts) 
		{
			image = ImageIO.read(getClass().getResource("/textures/10_of_hearts.jpg"));
		}
		
		else if (card.rank == Rank.Jack && card.suit == Suit.Hearts) 
		{
			image = ImageIO.read(getClass().getResource("/textures/jack_of_hearts.jpg"));
		}
		
		else if (card.rank == Rank.Queen && card.suit == Suit.Hearts) 
		{
			image = ImageIO.read(getClass().getResource("/textures/queen_of_hearts.jpg"));
		}
		
		else if (card.rank == Rank.King && card.suit == Suit.Hearts) 
		{
			image = ImageIO.read(getClass().getResource("/textures/king_of_hearts.jpg"));
		}
		
		else if (card.rank == Rank.Ace && card.suit == Suit.Hearts) 
		{
			image = ImageIO.read(getClass().getResource("/textures/ace_of_hearts.jpg"));
		}
		
		/* SPADES */
		
		else if (card.rank == Rank.Two && card.suit == Suit.Spades) 
		{
			image = ImageIO.read(getClass().getResource("/textures/2_of_spades.jpg"));
		}
		
		else if (card.rank == Rank.Three && card.suit == Suit.Spades) 
		{
			image = ImageIO.read(getClass().getResource("/textures/3_of_spades.jpg"));
		}
		
		else if (card.rank == Rank.Four && card.suit == Suit.Spades) 
		{
			image = ImageIO.read(getClass().getResource("/textures/4_of_spades.jpg"));
		}
		
		else if (card.rank == Rank.Five && card.suit == Suit.Spades) 
		{
			image = ImageIO.read(getClass().getResource("/textures/5_of_spades.jpg"));
		}
		
		else if (card.rank == Rank.Six && card.suit == Suit.Spades) 
		{
			image = ImageIO.read(getClass().getResource("/textures/6_of_spades.jpg"));
		}
		
		else if (card.rank == Rank.Seven && card.suit == Suit.Spades) 
		{
			image = ImageIO.read(getClass().getResource("/textures/7_of_spades.jpg"));
		}
		
		else if (card.rank == Rank.Eight && card.suit == Suit.Spades) 
		{
			image = ImageIO.read(getClass().getResource("/textures/8_of_spades.jpg"));
		}
		
		else if (card.rank == Rank.Nine && card.suit == Suit.Spades) 
		{
			image = ImageIO.read(getClass().getResource("/textures/9_of_spades.jpg"));
		}
		
		else if (card.rank == Rank.Ten && card.suit == Suit.Spades) 
		{
			image = ImageIO.read(getClass().getResource("/textures/10_of_spades.jpg"));
		}
		
		else if (card.rank == Rank.Jack && card.suit == Suit.Spades) 
		{
			image = ImageIO.read(getClass().getResource("/textures/jack_of_spades.jpg"));
		}
		
		else if (card.rank == Rank.Queen && card.suit == Suit.Spades) 
		{
			image = ImageIO.read(getClass().getResource("/textures/queen_of_spades.jpg"));
		}
		
		else if (card.rank == Rank.King && card.suit == Suit.Spades) 
		{
			image = ImageIO.read(getClass().getResource("/textures/king_of_spades.jpg"));
		}
		
		else if (card.rank == Rank.Ace && card.suit == Suit.Spades) 
		{
			image = ImageIO.read(getClass().getResource("/textures/ace_of_spades.jpg"));
		}
		
		this.repaint();
		
		}
		
		catch (Exception ex) 
		{
			System.out.println("Image not found!");
		}
		
	}//setCardImage
	
public void resetCardImage(Card card) 
{
	try 
	{
		image = ImageIO.read(getClass().getResource("/textures/default.jpg"));
		this.repaint();
	}
	
	catch (Exception ex) 
	{
		System.out.println("Image not found!");
	}
} //resetCardImage
	
} //custom PictureBox class for rendering images
