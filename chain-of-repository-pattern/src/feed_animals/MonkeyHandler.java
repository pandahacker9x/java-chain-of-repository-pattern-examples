package feed_animals;

public class MonkeyHandler extends AbstractHandler{
    @Override
    public void handle(String input) {
        if (input.equalsIgnoreCase("banana")) {
            System.out.println("Monky eat the banana");
        } else {
            super.handle(input);
        }
    }
}
