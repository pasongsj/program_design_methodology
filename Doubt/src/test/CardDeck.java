package test;
class CardDeck
{
  
  private int card_count;  // how many cards remain in the deck 
  private Card[] deck = new Card[4 * Card.SIZE_OF_SUIT];
    // invariant: elements  deck[0]..deck[card_count - 1]  hold cards

  public CardDeck()
  { createSuit(Card.SPADES);
    createSuit(Card.HEARTS);
    createSuit(Card.CLUBS);
    createSuit(Card.DIAMONDS);
  }

  /** newCard  gets a new card from the deck.
    * @return a card not used before, or return null, if no cards are left */
  public Card newCard()
  { Card next_card = null;
    int index = 0;
    if ( getCard_count() == 0 ) { 
      System.out.println("CardDeck error: no more cards"); 
    }
    else { 
      index = (int)(Math.random() * getCard_count());  // randomly choose
    }
    
    next_card = deck[index];
    
    // once card is extracted from deck, shift other cards to fill gap:
    for ( int i = index+1;  i != getCard_count();  i = i + 1 )
        // so far, cards from  index+1 to i-1  have been shifted left
        //  in the array by one position
        { deck[i - 1] = deck[i]; }
    setCard_count(getCard_count() - 1);
    return next_card;
  }

  /** moreCards  states whether the deck has more cards to give.
    * @return whether the deck is nonempty  */
  public boolean moreCards()
  { return (getCard_count() > 0); }

  /** createSuit creates a suit of cards for a new card deck. */
  private void createSuit(String which_suit)
  { for ( int i = 1;  i <= Card.SIZE_OF_SUIT;  i = i + 1 )
        { deck[getCard_count()] = new Card(which_suit, i);
          setCard_count(getCard_count() + 1);
        }
  }

public int getCard_count() {
	return card_count;
}

public void setCard_count(int card_count) {
	this.card_count = card_count;
}
}