package cardGame;


public class Card 
{
  
  private CardValueEnum cardValue;
  private CardSuitEnum suit;

  public Card (CardValueEnum cardValue, CardSuitEnum suit)
  {
    this.cardValue = cardValue;
    this.suit = suit;
  }
  
  public CardSuitEnum getSuit()
  {
    return this.suit;
  }

  
  public int getCardValue()
  {
    int retval;

    retval = 0;
    switch(cardValue) {
    case ACE:retval = 1;
    break;
    case TWO:retval = 2;
    break;
    case THREE:retval = 3;
    break;
    case FOUR:retval = 4;
    break;
    case FIVE:retval = 5;
    break;
    case SIX:retval = 6;  
    break;
    case SEVEN:retval = 7;
    break;
    case EIGHT:retval = 8;
    break;
    case NINE:retval = 9;
    break;
    case TEN:retval = 10;
    break;
    case JACK:retval = 11;
    break;
    case QUEEN:retval = 12;
    break; 
    case KING:retval = 13; 
    break; 
    }
    return retval;
  }
  
  
}