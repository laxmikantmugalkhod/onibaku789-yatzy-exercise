import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class YatzyTest {

    @Test
    public void testChance() {
        assertEquals(15, Yatzy.chance(2, 3, 4, 5, 1));
    }

    @Test
    public void testYatzy() {
        assertEquals(50, Yatzy.yatzy(4, 4, 4, 4, 4));
        assertEquals(0, Yatzy.yatzy(4, 4, 4, 4, 3));
    }

    @Test
    public void testOnes() {
        assertEquals(1, Yatzy.ones(1, 2, 3, 4, 5));
        assertEquals(2, Yatzy.ones(1, 2, 1, 4, 5));
    }

    @Test
    public void testTwosToSixes() {
        assertEquals(4, Yatzy.twos(1, 2, 3, 2, 6));
        assertEquals(6, Yatzy.threes(1, 2, 3, 2, 3));
        assertEquals(12, Yatzy.fours(4, 4, 4, 5, 5));
        assertEquals(15, Yatzy.fives(4, 4, 5, 5, 5));
        assertEquals(18, Yatzy.sixes(6, 5, 6, 6, 5));
    }

    @Test
    public void testScorePair() {
        assertEquals(6, Yatzy.scorePair(3, 4, 3, 5, 6));
    }

    @Test
    public void testTwoPair() {
        assertEquals(16, Yatzy.twoPair(3, 3, 5, 4, 5));
        assertEquals(0, Yatzy.twoPair(1, 2, 3, 4, 5));
    }

    @Test
    public void testThreeOfAKind() {
        assertEquals(9, Yatzy.threeOfAKind(3, 3, 3, 4, 5));
    }

    @Test
    public void testFourOfAKind() {
        assertEquals(12, Yatzy.fourOfAKind(3, 3, 3, 3, 5));
    }

    @Test
    public void testStraights() {
        assertEquals(15, Yatzy.smallStraight(1, 2, 3, 4, 5));
        assertEquals(20, Yatzy.largeStraight(2, 3, 4, 5, 6));
    }

    @Test
    public void testFullHouse() {
        assertEquals(18, Yatzy.fullHouse(6, 2, 2, 2, 6));
        assertEquals(0, Yatzy.fullHouse(2, 3, 4, 5, 6));
    }

}
