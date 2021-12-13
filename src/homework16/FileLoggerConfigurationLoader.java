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
                    for (Fields field: Fields.values()) {
                        if (line.startsWith(field.getDescription())){
                            field.fieldLoad(line,configuration);
                        }
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
            return configuration;
        }
        return null;
    }
}
