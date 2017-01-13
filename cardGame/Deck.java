package cardGame;
import java.util.*;


public class Deck {

  private ArrayList<Card> cards;

  public Deck() {
    this.cards = new ArrayList<Card>();
  }

  public int size() {
    return cards.size();
  }

  public void addCard(Card card) {
    cards.add(card);
  }

  public Card dealCard() {
    return cards.remove(0);
  }
}