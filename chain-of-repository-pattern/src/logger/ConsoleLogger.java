package logger;

public class ConsoleLogger extends Logger{

    public ConsoleLogger(LogLevel level) {
        super(level);
    }

    @Override
    void writeMsg(String msg) {
        System.out.println("Console logger: " + msg);
    }
}
