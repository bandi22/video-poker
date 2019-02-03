package videopoker;

public class Card {
	
	Suit suit;
	Rank rank;
	
	boolean held = false;
	
	public Card(Rank rank, Suit suit) 
	{
		this.rank = rank;
		this.suit = suit;
	}
	
	public String getName()
	{
		return this.rank + " of " + this.suit;
	}
	
}

enum Suit
{
	Clubs,Diamonds,Hearts,Spades
}

enum Rank 
{
	Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King,Ace
}
