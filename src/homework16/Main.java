package homework16;

public class Main {
    public static void main(String[] args) {
        doLoggerWithoutLoader();
        doLogger();
        doMultiLogger();
    }

    private static void doLoggerWithoutLoader() {
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration();
        fileLoggerConfiguration.setFileName("/home/ivakula/MyProjects/Course2/src/homework16/logWithoutLoader.log");
        fileLoggerConfiguration.setLevel(LoggingLevel.INFO);
        fileLoggerConfiguration.setFormatString("[%s] [%s] MESSAGE : [%s]");
        fileLoggerConfiguration.setFileSize(150);
        try {
            FileLogger logger = new FileLogger(fileLoggerConfiguration);
            logger.debug("Debug message one");
            logger.info("Info message one");
            logger.debug("Debug message two");
            logger.info("Info message two");
        } catch (FileMaxSizeReachedException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void doLogger() {
        FileLoggerConfiguration fileLoggerConfiguration = FileLoggerConfigurationLoader
                .load("/home/ivakula/MyProjects/Course2/src/homework16/Configuration.conf");
        try {
            FileLogger logger = new FileLogger(fileLoggerConfiguration);
            logger.debug("Debug message 1");
            logger.info("Info message 1");
            logger.debug("Debug message 2");
            logger.info("Info message 2");
        } catch (FileMaxSizeReachedException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void doMultiLogger() {
        FileLoggerConfiguration multiFileLoggerConfiguration = FileLoggerConfigurationLoader
                .load("/home/ivakula/MyProjects/Course2/src/homework16/MultiConfiguration.conf");

        MultiFileLogger multiLogger = new MultiFileLogger(multiFileLoggerConfiguration);
        multiLogger.debug("Debug message 1");
        multiLogger.info("Info message 1");
        multiLogger.debug("Debug message 2");
        multiLogger.info("Info message 2");
    }
}
