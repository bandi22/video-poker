package videopoker;

import java.util.*;

public class Deck {
	
	Card[] cards = new Card[52];
	Random rnd = new Random();
	
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

public Card[] deal () 
{
	Card[] hand = new Card[5];
	Arrays.fill(hand, null);
	int i = 0;
	
	while(i < 5) 
	{
		int j = rnd.nextInt(52);
		
		if (!Arrays.asList(hand).contains(this.cards[j])) 
		{
			hand[i] = this.cards[j];
			i++;
		}	
		
	} //while
	
	return hand;	
	
} //deal()

public Card[] dealSecond (Card[] hand) 
{	
	Card[] dealt = new Card[5];
	System.arraycopy(hand, 0, dealt, 0, hand.length);
	
	int i = 0;
	
	while (i < 5)
	{
		
		if (hand[i].held == true) 
		{
			i++;
		}
		
		else if (hand[i].held == false) 
		{
			int j = rnd.nextInt(52);
			
			if(!Arrays.asList(hand).contains(this.cards[j]) && !Arrays.asList(dealt).contains(this.cards[j]))
			{
				hand[i] = this.cards[j];
				i++;
			}
			
			else 
			{
				continue;
			}
		} //else if
		
	} //while
	
	return hand;
	
}//dealSecond

} //class