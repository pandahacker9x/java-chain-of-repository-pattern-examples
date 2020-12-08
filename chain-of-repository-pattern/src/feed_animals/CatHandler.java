package feed_animals;

public class CatHandler extends AbstractHandler {
    @Override
    public void handle(String input) {
        if (input.equalsIgnoreCase("fish")) {
            System.out.println("Cat eat the fish");
        } else {
            super.handle(input);
        }
    }
}
