import cardGame.*;
import static org.junit.Assert.*;
import org.junit.*;



public class CardTest {

 private Card twoOfHearts;
 private Card threeOfSpades;

 @Before 
 public void before(){
  twoOfHearts = new Card(CardValue.TWO, Suit.HEARTS);
  threeOfSpades = new Card(CardValue.THREE, Suit.SPADES);
}

@Test
public void canGetCardValue(){
 assertEquals(CardValue.TWO,twoOfHearts.getCardValue());
} 

@Test
public void canGetSuit() {
 assertEquals(Suit.HEARTS, twoOfHearts.getSuit());
}


@Test
public void canGetDifferentSuit() {
 assertEquals(Suit.SPADES, threeOfSpades.getSuit());
}
}