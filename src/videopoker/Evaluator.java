package videopoker;

import java.util.Arrays;

public class Evaluator {
	
public static boolean isFlush(Card[] hand) 
{	
	for (int i = 1; i < hand.length;i++) 
	{
		if (hand[i].suit != hand[i-1].suit) 
		{
			return false;
		}
	} //checks if hand is flush (i.e. all 5 cards has the same suit)
	
	return true;
} //check if had is flush

public static int[] histogram(Card[] hand) 
{
	int[] Combos = new int[13];
	Arrays.fill(Combos, 0);
	
	for (int i = 0; i < hand.length; i++) 
	{
		switch (hand[i].rank) 
		{
			case Two:
				Combos[0]++;
			break;
			case Three:
				Combos[1]++;
			break;
			case Four:
				Combos[2]++;
			break;
			case Five:
				Combos[3]++;
			break;
			case Six:
				Combos[4]++;
			break;
			case Seven:
				Combos[5]++;
			break;
			case Eight:
				Combos[6]++;
			break;
			case Nine:
				Combos[7]++;
			break;
			case Ten:
				Combos[8]++;
			break;
			case Jack:
				Combos[9]++;
			break;
			case Queen:
				Combos[10]++;
			break;
			case King:
				Combos[11]++;
			break;
			case Ace:
				Combos[12]++;
			break;
		}//switch
	}//for -- fill histogram array
	
	return Combos;
	
}//histogram method

public static int countSimilar(int number, int histogram[]) 
{
	int count = 0;
	
	for(int i = 0; i < histogram.length; i++) 
	{
		if (histogram[i] == number) 
		{
			count++;
		}
	}
	
	return count;
} //countSimilar
/*method checks if number of similar values is present in the histogram; 
	 e. g. number 4 indicates a four-of-a-kind */ 

public static boolean jacksOrBetter(int histogram[]) 
{
	if ((histogram[9] == 2) || (histogram[10] == 2) || (histogram[11] == 2) || (histogram[12] == 2)) 
	{
		return true;
	}
	
	else {
		return false;
	}	
} //checks if there are any pairs of Jacks or better; use with checkHand pair condition branch!

public static boolean isStraight(int histogram[]) 
{
	int first = 0;
	int last = 0;
	
	for(int i = 0; i < histogram.length; i++) 
	{
		if (histogram[i] == 1) 
		{
			first = i+1;
			break;
		}
	}
	
	for(int i = histogram.length-1; i > 0; i--) 
	{
		if (histogram[i] == 1) 
		{
			last = i+1;
			break;
		}
	}
	
	if (last-first == 4) 
	{
		return true;
	}
	else 
	{
		return false;
	}
	
} //method to determine if an a hand is a straight; use when histogram has five 1 values!

public static Combo checkHand(Card[] hand) 
{
	
	Combo score = Combo.HIGH_CARD;  
	
	int[] histogram = Evaluator.histogram(hand);
	
	if ((Evaluator.countSimilar(1, histogram) == 5) && (Evaluator.isStraight(histogram) == true) && (!Evaluator.isFlush(hand))) 
	{
		score = Combo.STRAIGHT;
		Game.multiplier = 4;
	}
	
	else if (Evaluator.isFlush(hand) && (Evaluator.isStraight(histogram) == false)) 
	{
		score = Combo.FLUSH;
		Game.multiplier = 6;
	}
	
	else if ((Evaluator.countSimilar(1, histogram) == 5) && (Evaluator.isStraight(histogram) == true) && (Evaluator.isFlush(hand) == true)) 
	{
		if (histogram[12] == 1) {
			score = Combo.ROYAL_FLUSH;
			
				if(Game.bet > 0 && Game.bet < 5) {
					Game.multiplier = 250;
				}
				else if(Game.bet == 5) 
				{
					Game.multiplier = 800;
				}		
		}
		else 
		{
			score = Combo.STRAIGHT_FLUSH;
			Game.multiplier = 50;
		}
	}
	
	else if ((Evaluator.countSimilar(3, histogram) > 0) && (Evaluator.countSimilar(2, histogram) > 0)) 
	{
		score = Combo.FULL_HOUSE;
		Game.multiplier = 9;
	}
	
	else if ((Evaluator.countSimilar(2, histogram) == 1) && (Evaluator.jacksOrBetter(histogram) == true)) 
	{
		score = Combo.JACKS_OR_BETTER;
		Game.multiplier = 1;
	}
	
	else if (Evaluator.countSimilar(2, histogram) == 2) 
	{
		score = Combo.TWO_PAIR;
		Game.multiplier = 2;
	}
	
	else if (Evaluator.countSimilar(3, histogram) > 0) 
	{
		score = Combo.THREE_OF_A_KIND;
		Game.multiplier = 3;
	}
	
	else if (Evaluator.countSimilar(4, histogram) > 0) 
	{
		score = Combo.FOUR_OF_A_KIND;
		Game.multiplier = 25;
	}

	return score;
}

}//class Evaluator