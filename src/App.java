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

    public static void main(String[] args) throws Exception {
        // Float num1 = 20.5;
        // Test case 1
        System.out.println("TC 1");
        System.out.println("Max of 20.5, 15.1, 10.9: " + findMax(20.5F, 15.1F, 10.9F));

        // Test case 2
        System.out.println("TC 2");
        System.out.println("Max of 20.1, 35.3, 10.6: " + findMax(20.1F, 35.3F, 10.6F));

        // Test case 3
        System.out.println("TC 3");
        System.out.println("Max of 20.4, 15.5, 50.5: " + findMax(20.4F, 15.5F, 50.5F));
    }
}
