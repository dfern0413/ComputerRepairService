package exception;

public class InvalidOrderNumberException extends Exception{
    public InvalidOrderNumberException(String message){
        super(message);
    }
}
