package logger;

public enum LogLevel {
    NONE(0), INFO(1), DEBUG(2), ERROR(3), FATAL(4);

    private final int level;

    LogLevel(int level) {
        this.level = level;
    }

    public int getValue() {
        return level;
    }
}
