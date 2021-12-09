package homework16;

import java.time.LocalDateTime;

public abstract class AbstractLogger implements MyLogger {
    protected final FileLoggerConfiguration configuration;

    public AbstractLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
    }

    protected abstract void writeToFile(String message, LoggingLevel loggingLevel);

    protected boolean checkLevel(LoggingLevel loggingLevel) {
        if (LoggingLevel.DEBUG.equals(configuration.getLevel())) {
            return true;
        } else return LoggingLevel.INFO.equals(loggingLevel);
    }

    @Override
    public void debug(String message) {
        writeToFile(String.format(configuration.getFormatString(),
                LocalDateTime.now(), "DEBUG", message), LoggingLevel.DEBUG);
    }

    @Override
    public void info(String message) {
        writeToFile(String.format(configuration.getFormatString(),
                LocalDateTime.now(), "INFO", message), LoggingLevel.INFO);
    }
}
