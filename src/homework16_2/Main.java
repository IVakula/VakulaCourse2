package homework16_2;

public class Main {
    public static void main(String[] args) {
        doLoggerWithoutLoader();
        doLogger();
        doMultiLogger();
        doStdoutLogger();
    }

    private static void doLoggerWithoutLoader() {
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration();
        fileLoggerConfiguration.setFileName("/home/ivakula/MyProjects/Course2/src/homework16_2/logWithoutLoader.log");
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
        FileLoggerConfigurationLoader loader = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration fileLoggerConfiguration = loader
                .load("/home/ivakula/MyProjects/Course2/src/homework16_2/Configuration.conf");
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
        FileLoggerConfigurationLoader multiLoader = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration multiFileLoggerConfiguration = multiLoader
                .load("/home/ivakula/MyProjects/Course2/src/homework16_2/MultiConfiguration.conf");

        MultiFileLogger multiLogger = new MultiFileLogger(multiFileLoggerConfiguration);
        multiLogger.debug("Debug message 1");
        multiLogger.info("Info message 1");
        multiLogger.debug("Debug message 2");
        multiLogger.info("Info message 2");
    }
    private static void doStdoutLogger(){
        StdoutLoggerConfigurationLoader stdoutLoader = new StdoutLoggerConfigurationLoader();
        BaseLoggerConfiguration baseLoggerConfiguration = stdoutLoader
                .load("/home/ivakula/MyProjects/Course2/src/homework16_2/StdoutConfiguration.conf");
        StdoutLogger stdoutLogger = new StdoutLogger(baseLoggerConfiguration);
        stdoutLogger.debug("Debug message 1");
        stdoutLogger.info("Info message 1");
        stdoutLogger.debug("Debug message 2");
        stdoutLogger.info("Info message 2");
    }
}
