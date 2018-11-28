package image;

public class NotSupportedException extends RuntimeException {

    String error;

    public NotSupportedException(String error){
        this.error=error;
    }
}
