public class App {

    public static void main(String[] args) throws Exception {
        FindMax<Integer> intObj = new FindMax<Integer>(20, 15, 25);
        intObj.printMax();

        FindMax<Float> floatObj = new FindMax<Float>(20.2F, 20.3F, 20.1F);
        floatObj.printMax();

        FindMax<String> stringObj = new FindMax<String>("Apple", "Banana", "Peach");
        stringObj.printMax();
    }
}
