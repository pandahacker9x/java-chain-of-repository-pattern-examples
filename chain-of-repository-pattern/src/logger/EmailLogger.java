package logger;

public class EmailLogger extends Logger{

    public EmailLogger(LogLevel level) {
        super(level);
    }

    @Override
    void writeMsg(String msg) {
        System.out.println("Email logger: " + msg);
    }
}
