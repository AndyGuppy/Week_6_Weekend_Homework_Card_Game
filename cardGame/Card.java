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

  
  public CardValueEnum getCardValue()
  {
    return this.cardValue;
  }
  
  
}