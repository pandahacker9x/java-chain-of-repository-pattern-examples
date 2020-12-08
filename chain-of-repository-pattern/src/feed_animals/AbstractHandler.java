package feed_animals;

public abstract class AbstractHandler implements Handler{
    private Handler next;

    @Override
    public void handle(String input) {
        if (next != null) {
            next.handle(input);
        }
    }

    @Override
    public Handler setNext(Handler handler) {
        this.next = handler;
        return handler;
    }
}
