public class App {
    public static Integer findMax(Integer num1, Integer num2, Integer num3) {
        int maxOfFirstTwo = num1.compareTo(num2);

        if (maxOfFirstTwo > 0)
            maxOfFirstTwo = num1;
        else
            maxOfFirstTwo = num2;

        int maxOfAllThree = Integer.valueOf(maxOfFirstTwo).compareTo(num3);

        if (maxOfAllThree > 0)
            return maxOfFirstTwo;

        return num3;
    }

    public static Float findMax(Float num1, Float num2, Float num3) {
        int maxOfFirstTwo = num1.compareTo(num2);

        Float maxOfTwo;
        if (maxOfFirstTwo > 0)
            maxOfTwo = num1;
        else
            maxOfTwo = num2;

        int maxOfAllThree = maxOfTwo.compareTo(num3);

        if (maxOfAllThree > 0)
            return maxOfTwo;

        return num3;
    }

    public static String findMax(String num1, String num2, String num3) {
        int maxOfFirstTwo = num1.compareTo(num2);

        String maxOfTwo;
        if (maxOfFirstTwo > 0)
            maxOfTwo = num1;
        else
            maxOfTwo = num2;

        int maxOfAllThree = maxOfTwo.compareTo(num3);

        if (maxOfAllThree > 0)
            return maxOfTwo;

        return num3;
    }

    public static void main(String[] args) throws Exception {
        // Test case 1
        System.out.println("TC 1");
        System.out.println("Max of Apple, Peach, Banana: " + findMax("Apple", "Peach", "Banana"));

        // Test case 2
        System.out.println("TC 2");
        System.out.println("Max of Peach, Banana, Apple: " + findMax("Peach", "Banana", "Apple"));

        // Test case 3
        System.out.println("TC 3");
        System.out.println("Max of Banana, Apple, Peach: " + findMax("Banana", "Apple", "Peach"));
    }
}
