import java.util.ArrayList;
import java.util.Random;

import ch.aplu.jcardgame.Card;
import ch.aplu.jcardgame.Hand;

public class RandomAdapter implements ICardAdapter{
	
    private RandomCard selected;
    private Hand hand;
	private ArrayList<Card> cardList;
	private Whist.Suit trumps;
	private Random random;
    
  
	
    public RandomAdapter(Hand hand, ArrayList<Card> cardList, Whist.Suit trumps, Random random) {
    	this.hand = hand;
    	this.cardList = cardList;
    	this.trumps = trumps;
    	this.random = random;
    	selected = new RandomCard(hand,  cardList,  trumps, random);
    }
    
    public Card selectCard() {
    	return selected.randomCard();
    }
}
