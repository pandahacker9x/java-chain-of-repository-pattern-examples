package logger;

public class AppLogger{
    private static final Logger logger;

    static{
        logger = new EmailLogger(LogLevel.FATAL);

        FileLogger fileLogger = new FileLogger(LogLevel.ERROR);
        logger.setNextLogger(fileLogger);

        fileLogger.setNextLogger(new ConsoleLogger(LogLevel.DEBUG));
    }

    public static void log(String msg, LogLevel logLevel) {
        logger.log(msg, logLevel);
    }

    public static void main(String[] args) {
        log("abc", LogLevel.FATAL);
    }
}
