public class App {

    public static void main(String[] args) throws Exception {
        FindMax<Integer> intObj = new FindMax<Integer>(20, 15, 25);
        System.out.println("Max of " + intObj.val1 + ", " + intObj.val2 + ", " + intObj.val3 + ": " + intObj.getMax());

        FindMax<Float> floatObj = new FindMax<Float>(20.2F, 20.3F, 20.1F);
        System.out.println(
                "Max of " + floatObj.val1 + ", " + floatObj.val2 + ", " + floatObj.val3 + ": " + floatObj.getMax());

        FindMax<String> stringObj = new FindMax<String>("Apple", "Banana", "Peach");
        System.out.println(
                "Max of " + stringObj.val1 + ", " + stringObj.val2 + ", " + stringObj.val3 + ": " + stringObj.getMax());
    }
}
