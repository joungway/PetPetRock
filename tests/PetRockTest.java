import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {
    private PetRock rocky = new PetRock("Rocky");
    private PetRock bocky = rocky; //new PetRock("Rocky");

    @Before
    public void myTestSetUp() throws Exception {
        // rocky = new PetRock("Rocky");
       // bocky = new PetRock("Bocky");
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testName() throws Exception {
        assertSame(rocky, bocky);
    }

    @Test
    public void testUnhappyToStart() throws Exception {
        assertFalse(rocky.ishappy());
    }

    @Test
    public void testHappyAfterPlay() throws Exception  {
        rocky.playWithRock();
        assertTrue(rocky.ishappy());
    }

    @Ignore ("Exception throwing now yet defined")
    @Test (expected = IllegalStateException.class)
    public void nameFail() throws Exception {
        rocky.getHappyMessage();
    }

    @Test
    public void name() throws Exception {
        rocky.playWithRock();
        String msg = rocky.getHappyMessage();
        assertEquals("I'm happy!", msg);
    }

    @Test
    public void testFavNum() throws Exception {
        assertEquals(42, rocky.getFavNumber());
    }

    @Test (expected = IllegalArgumentException.class)
    public void emptyNameFail() throws Exception {
        new PetRock("");
    }

    @Test
    public void testPersonString() {
        assertEquals("Rocky is not happy",rocky.toString());
    }
}
