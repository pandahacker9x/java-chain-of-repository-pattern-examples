package feed_animals;

public class Main {
    public static void main(String[] args) {
        Handler feedAnimalHandler = new DogHandler();
        feedAnimalHandler.setNext(new CatHandler())
            .setNext(new MonkeyHandler());
        feedAnimalHandler.handle("banana");
        feedAnimalHandler.handle("xuong");
        feedAnimalHandler.handle("fish");
    }
}
