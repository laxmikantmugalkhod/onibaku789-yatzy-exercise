import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class YatzyJava {

    public static int chance(int... dice) {
        return Arrays.stream(dice).sum();
    }

    public static int yatzy(int... dice) {
        Map<Integer, Long> counts = Arrays.stream(dice)
                .boxed()
                .collect(Collectors.groupingBy(d -> d, Collectors.counting()));
        return counts.containsValue(5L) ? 50 : 0;
    }

    public static int ones(int... dice) {
        return sumOfNumber(dice, 1);
    }

    public static int twos(int... dice) {
        return sumOfNumber(dice, 2);
    }

    public static int threes(int... dice) {
        return sumOfNumber(dice, 3);
    }

    public static int fours(int... dice) {
        return sumOfNumber(dice, 4);
    }

    public static int fives(int... dice) {
        return sumOfNumber(dice, 5);
    }

    public static int sixes(int... dice) {
        return sumOfNumber(dice, 6);
    }

    private static int sumOfNumber(int[] dice, int number) {
        return (int) Arrays.stream(dice)
                .filter(d -> d == number)
                .count() * number;
    }
}
