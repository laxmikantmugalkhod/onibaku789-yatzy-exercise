import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class YatzyJavaTest {

    @Test
    public void testChance() {
        assertEquals(15, YatzyJava.chance(2, 3, 4, 5, 1));
    }

    @Test
    public void testYatzy() {
        assertEquals(50, YatzyJava.yatzy(4, 4, 4, 4, 4));
        assertEquals(0, YatzyJava.yatzy(4, 4, 4, 4, 3));
    }

    @Test
    public void testOnes() {
        assertEquals(1, YatzyJava.ones(1, 2, 3, 4, 5));
        assertEquals(2, YatzyJava.ones(1, 2, 1, 4, 5));
    }

    @Test
    public void testTwosToSixes() {
        assertEquals(4, YatzyJava.twos(1, 2, 3, 2, 6));
        assertEquals(6, YatzyJava.threes(1, 2, 3, 2, 3));
        assertEquals(12, YatzyJava.fours(4, 4, 4, 5, 5));
        assertEquals(15, YatzyJava.fives(4, 4, 5, 5, 5));
        assertEquals(18, YatzyJava.sixes(6, 5, 6, 6, 5));
    }

}
