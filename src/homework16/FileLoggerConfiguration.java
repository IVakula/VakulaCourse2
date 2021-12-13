package homework16;

public class FileLoggerConfiguration {
    private String fileName;
    private LoggingLevel level;
    private long fileSize;
    private String formatString;


    public String getFile() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public LoggingLevel getLevel() {
        return level;
    }

    public void setLevel(LoggingLevel level) {
        this.level = level;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormatString() {
        return formatString;
    }

    public void setFormatString(String formatString) {
        this.formatString = formatString;
    }
}
