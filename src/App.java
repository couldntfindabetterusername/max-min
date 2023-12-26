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

    public static void main(String[] args) throws Exception {
        // Test case 1
        System.out.println("TC 1");
        System.out.println("Max of 20, 15, 10: " + findMax(20, 15, 10));

        // Test case 2
        System.out.println("TC 2");
        System.out.println("Max of 20, 35, 10: " + findMax(20, 35, 10));

        // Test case 3
        System.out.println("TC 3");
        System.out.println("Max of 20, 15, 50: " + findMax(20, 15, 50));
    }
}
