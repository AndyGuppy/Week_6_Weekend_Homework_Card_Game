import static org.junit.Assert.*;
import org.junit.*;
import cardGame.*;

public class DeckTest {

  Deck threeCardDeck, moreCardDeck;
  Card cardOne, cardTwo, cardThree, cardFour, cardFive;

  @Before
  public void before() {
    cardOne = new Card(CardValueEnum.TWO, CardSuitEnum.SPADES);
    cardTwo = new Card(CardValueEnum.NINE, CardSuitEnum.HEARTS);
    cardThree = new Card(CardValueEnum.ACE, CardSuitEnum.DIAMONDS);
    cardFour = new Card(CardValueEnum.SEVEN, CardSuitEnum.HEARTS);
    cardFive = new Card(CardValueEnum.QUEEN, CardSuitEnum.CLUBS);

    
    threeCardDeck = new Deck();
    moreCardDeck = new Deck();

    threeCardDeck.addCard(cardOne);
    threeCardDeck.addCard(cardTwo);
    threeCardDeck.addCard(cardThree);

     moreCardDeck.addCard(cardOne);
     moreCardDeck.addCard(cardTwo);
     moreCardDeck.addCard(cardThree);
     moreCardDeck.addCard(cardFour);
     moreCardDeck.addCard(cardFive);


  }

  @Test
  public void canCreateaDeck() {
    assertNotNull(threeCardDeck);
  }

  @Test
  public void canDealaCard() {
    assertEquals(cardOne, threeCardDeck.dealCard());
  }

  @Test
  public void canGetSize() {
    assertEquals(3, threeCardDeck.size());
    assertEquals(5, moreCardDeck.size());
  }

  @Test
  public void checkIfDeckReducesAfterDealingACard() {
    moreCardDeck.dealCard();
    assertEquals(4, moreCardDeck.size());
  }


}