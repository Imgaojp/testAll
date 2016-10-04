package chapter5;

/**
 * Created by i on 2016/9/7.
 */
public class WildcardsTest {
    public static void main(String[] args) {
        WildcardsTest t = new WildcardsTest();
        Cage<Lion> LionCage = new Cage<Lion>();
        Cage<ButterFly> butterFlyCage = new Cage<ButterFly>();
        LionCage.add(new Lion());
        butterFlyCage.add(new ButterFly());
        t.feedAnimals(LionCage);
        t.feedAnimals(butterFlyCage);
    }

    void feedAnimals(Cage<? extends Animal> someCage) {
        for (Animal a : someCage) {
            a.feedMe();
        }
    }
}
