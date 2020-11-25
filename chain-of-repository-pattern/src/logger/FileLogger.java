package logger;

public class FileLogger extends Logger{
    public FileLogger(LogLevel level) {
        super(level);
    }

    @Override
    void writeMsg(String msg) {
        System.out.println("File logger: " + msg);
    }
}
