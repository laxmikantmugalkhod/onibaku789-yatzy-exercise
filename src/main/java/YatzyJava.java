import java.util.Arrays;

public class YatzyJava {

    public static int chance(int... dice) {
        return Arrays.stream(dice).sum();
    }
}
