package examples.simple;

public class PToK {

    public static final float KILOGRAMS_PER_POUND = 0.4535924f;

    public static void main(String[] args) {
        System.out.println(poundsToKilograms(100.15f));
    }
    static float poundsToKilograms(float pounds) {
        return pounds * KILOGRAMS_PER_POUND;
    }
}
