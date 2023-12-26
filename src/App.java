public class App {

    public static void main(String[] args) throws Exception {
        FindMax<Integer> intObj = new FindMax<Integer>(20, 15, 25);
        System.out.println("Max of given values: " + intObj.getMax());

        FindMax<Float> floatObj = new FindMax<Float>(20.2F, 20.3F, 20.1F);
        System.out.println(
                "Max of given values: " + floatObj.getMax());

        FindMax<String> stringObj = new FindMax<String>("Apple", "Banana", "Peach");
        System.out.println(
                "Max of given values: " + stringObj.getMax());
    }
}
