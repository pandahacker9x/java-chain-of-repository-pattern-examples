package feed_animals;

public class DogHandler extends AbstractHandler {
    @Override
    public void handle(String input) {
        if (input.equalsIgnoreCase("xuong")) {
            System.out.println("Dog eat the xuong");
        } else {
            super.handle(input);
        }
    }
}
