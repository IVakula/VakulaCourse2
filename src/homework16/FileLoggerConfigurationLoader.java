package homework16;

import java.io.*;

public class FileLoggerConfigurationLoader {
    public static FileLoggerConfiguration load(String fileName) {
        File file = new File(fileName);
        if (file.exists() && file.length() > 0) {
            FileLoggerConfiguration configuration = new FileLoggerConfiguration();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

                bufferedReader.lines().forEach(line -> {
                    if (line.startsWith("FILE:")) {
                        configuration.setFileName(line.split(":")[1].trim());
                    } else if (line.startsWith("LEVEL:")) {
                        configuration.setLevel(LoggingLevel.valueOf(line.split(":")[1].trim()));
                    } else if (line.startsWith("MAX-SIZE:")) {
                        configuration.setFileSize(Long.parseLong(line.split(":")[1].trim()));
                    } else if (line.startsWith("FORMAT:")) {
                        configuration.setFormatString(line.split("AT:")[1].trim());
                    }
                });
            } catch (IOException e) {
                System.out.println("Error");
            }
            return configuration;
        }
        return null;
    }
}
