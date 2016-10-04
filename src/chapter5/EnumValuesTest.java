package chapter5;

/**
 * Created by i on 2016/9/8.
 */
enum Week {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumValuesTest {
    public static void main(String[] args) {
        for (Week w : Week.values()
                ) {
            System.out.print(w.name() + ", ");
        }
    }
}
