package exceptions;

public class NotAValidMove extends RuntimeException
{
    public NotAValidMove(String message)
    {
        super(message);
    }
}

