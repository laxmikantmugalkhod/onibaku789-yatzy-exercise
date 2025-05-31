import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class YatzyJavaTest {

    @Test
    public void testChance() {
        assertEquals(15, YatzyJava.chance(2, 3, 4, 5, 1));
    }

}
