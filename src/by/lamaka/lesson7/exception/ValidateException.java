package by.lamaka.lesson7.exception;

public class ValidateException extends Exception {
    public ValidateException() {
        super();
    }

    public ValidateException(String message) {
        super(message);
    }

    public ValidateException(String message, Exception e) {
        super(message, e);
    }

    public ValidateException(Exception e) {
        super(e);
    }
}
