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
}
