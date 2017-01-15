import static org.junit.Assert.*;
import org.junit.*;
import cardGame.*;

public class HandTest {
  Hand hand;

  @Before
  public void setup() {
    hand = new Hand();
  }

  @Test
  public void canCreateHand() {
    assertNotNull(hand);
  }

  @Test
  public void canGetCard() {
    Card testCard = new Card(CardValueEnum.NINE,CardSuitEnum.HEARTS);
    hand.addCard(testCard);
    assertEquals(testCard, hand.getCard(0));
  }

  @Test
  public void canGetCardCount() {
    Card testCard = new Card(CardValueEnum.NINE,CardSuitEnum.HEARTS);
    Card testCard2 = new Card(CardValueEnum.FOUR,CardSuitEnum.CLUBS);
    hand.addCard(testCard);
    hand.addCard(testCard2);
    assertEquals(2,hand.getCardCount() );
  }

  @Test
  public void canClearhand() {
    Card testCard = new Card(CardValueEnum.NINE,CardSuitEnum.HEARTS);
    Card testCard2 = new Card(CardValueEnum.FOUR,CardSuitEnum.CLUBS);
    hand.addCard(testCard);
    hand.addCard(testCard2);
    hand.clear();
    assertEquals(0,hand.getCardCount() );
  }
}