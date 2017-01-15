import cardGame.*;
import org.junit.*;
import static org.junit.Assert.*;

public class PlayerTest {
  Player andy;
  Player pauline;

  @Before
  public void setup() {
    andy = new Player("Andy");
    pauline = new Player("Pauline");
  }

  @Test
  public void canCreate() {

    assertNotNull(pauline);
  }

  @Test
  public void canGetName() {
    assertEquals("Andy", andy.getName());
  }

  @Test
  public void canGetAnotherName() {
    assertEquals("Pauline", pauline.getName());
  }

  @Test
  public void canGetHand() {
    assertNotNull(andy.getHand());
  }

}