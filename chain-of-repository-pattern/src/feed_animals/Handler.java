package feed_animals;

public interface Handler {
    void handle(String input);
    Handler setNext(Handler handler);
}
