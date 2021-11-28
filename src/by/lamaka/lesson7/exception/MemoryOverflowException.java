package by.lamaka.lesson7.exception;

public class MemoryOverflowException extends Exception {

    public MemoryOverflowException() {
        super();
    }

    public MemoryOverflowException(String message) {
        super(message);
    }

    public MemoryOverflowException(String message, Exception e) {
        super(message, e);
    }

    public MemoryOverflowException(Exception e) {
        super(e);
    }
}
