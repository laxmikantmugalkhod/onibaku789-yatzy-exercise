import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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

    public static int scorePair(int... dice) {
        return calculateGroupedDiceScore(dice, 2, 1);
    }

    public static int twoPair(int... dice) {
        return calculateGroupedDiceScore(dice, 2, 2);
    }

    public static int threeOfAKind(int... dice) {
        return calculateGroupedDiceScore(dice, 3, 1);
    }

    public static int fourOfAKind(int... dice) {
        return calculateGroupedDiceScore(dice, 4, 1);
    }

    public static int smallStraight(int... dice) {
        return Arrays.stream(dice).sorted().boxed().toList().equals(List.of(1, 2, 3, 4, 5)) ? 15 : 0;
    }

    public static int largeStraight(int... dice) {
        return Arrays.stream(dice).sorted().boxed().toList().equals(List.of(2, 3, 4, 5, 6)) ? 20 : 0;
    }

    private static int calculateGroupedDiceScore(int[] dice, int groupSize, int requiredGroupCount) {
        Map<Integer, Long> counts = Arrays.stream(dice)
                .boxed()
                .collect(Collectors.groupingBy(d -> d, Collectors.counting()));

        List<Integer> groups = counts.entrySet().stream()
                .filter(e -> e.getValue() >= groupSize)
                .map(Map.Entry::getKey)
                .sorted(Comparator.reverseOrder())
                .limit(requiredGroupCount)
                .toList();

        return groups.size() == requiredGroupCount
                ? groups.stream().mapToInt(val -> val * groupSize).sum()
                : 0;
    }
}
