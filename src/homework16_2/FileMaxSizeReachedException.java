package homework16_2;

public class FileMaxSizeReachedException extends RuntimeException{
    public FileMaxSizeReachedException(String message) {
        super(message);
    }
}
