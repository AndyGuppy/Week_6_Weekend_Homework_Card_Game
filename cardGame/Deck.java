package cardGame;
import java.util.*;


public class Deck {

  private ArrayList<Card> deck;

  public  Deck() {

    this.deck = new ArrayList<Card>();

    // build a deck of cards (52 cards)
    for (int s=0; s<4; s++)

    {
      CardSuitEnum suit = CardSuitEnum.values()[s];

      for  (int v=0; v<13; v++)     {
        Card card = new Card(CardValueEnum.values()[v],suit);
        this.deck.add(card);
      }
    }
    //  // Shuffle the deck    
    // Collections.shuffle(deck);
  }

  public int size() {
    return deck.size();
  }

  public void addCard(Card card) {
    deck.add(card);
  }

  public Card dealCard() {
    return deck.remove(0);
  }

  public void shuffleDeck() {
    Collections.shuffle(deck);
  }

}