package cardGame;

public class Card
{
  
  private CardValue cardValue;
  private Suit suit;

  public Card (CardValue cardValue, Suit suit)
  {
    this.cardValue = cardValue;
    this.suit = suit;
  }
  
  public Suit getSuit()
  {
    return this.suit;
  }

  
  public CardValue getCardValue()
  {
    return this.cardValue;
  }
  
  
}