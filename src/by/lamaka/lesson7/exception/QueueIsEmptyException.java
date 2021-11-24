package by.lamaka.lesson7.exception;

public class QueueIsEmptyException extends Exception {
    public QueueIsEmptyException() {
        super();
    }

    public QueueIsEmptyException(Exception e) {
        super(e);
    }

    public QueueIsEmptyException(String message, Exception e) {
        super(message, e);
    }

    public QueueIsEmptyException(String message) {
        super(message);
    }
}
