package homework20;

public class NonUniqueMethodException extends Exception {
    public NonUniqueMethodException(String methodName) {
        super("Method " + methodName + " is not unique");
    }

}
