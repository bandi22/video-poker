package videopoker;

import java.util.*;

public class Deck {
	
	Card[] cards = new Card[52];
	
public Deck() 
{
	int i = 0;
	for(Suit suit : Suit.values()) 
	{
		for(Rank rank : Rank.values()) 
		{
			cards[i++] = new Card(rank, suit);
		}
	}

} //constructor

public ArrayList<Card> deal () 
{
	Random rnd = new Random();
	ArrayList<Card> hand = new ArrayList<Card>();
	int i = 0;
	
	while(i < 5) 
	{
		int j = rnd.nextInt(52);
		
		if (!hand.contains(this.cards[j])) 
		{
			hand.add(this.cards[j]);
			i++;
		}	
		
	} //while
	
	return hand;	
	
} //

} //class