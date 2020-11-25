package logger;

public abstract class Logger {
    private Logger nextLogger;
    private LogLevel level;

    public Logger(LogLevel level) {
        this.level = level;
    }

    abstract void writeMsg(String msg);

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    void log(String msg, LogLevel logLevel) {
        if (logLevel.getValue() >= level.getValue()) {
            writeMsg(msg);
        }
        if (nextLogger != null) {
            nextLogger.log(msg, logLevel);
        }
    }

}
