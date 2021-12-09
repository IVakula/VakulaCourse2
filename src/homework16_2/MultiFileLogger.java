package homework16_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class MultiFileLogger extends AbstractLogger<FileLoggerConfiguration> {

    private String currentFileName;

    public MultiFileLogger(FileLoggerConfiguration configuration) {
        super(configuration);
    }

    @Override
    public void writeToFile(String message, LoggingLevel loggingLevel) {
        if (currentFileName == null) {
            currentFileName = generateNewFileName();
        }
        File file = new File(configuration.getFile().concat(currentFileName));
        if (file.exists() && file.length() >= configuration.getFileSize()) {
            currentFileName = generateNewFileName();
            file = new File(configuration.getFile().concat(currentFileName));
        }
        if (checkLevel(loggingLevel)) {
            try {
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(message);
                fileWriter.write("\n");
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error");
            }
        }
    }

    private String generateNewFileName() {
        return String.format("Log_%1$TY-%1$TM-%1$Td-%1$TT.txt", LocalDateTime.now());
    }
}

