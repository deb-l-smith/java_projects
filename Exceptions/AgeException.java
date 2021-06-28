public class AgeException extends Exception
{
	public AgeException() {
		super("Invalid Age information \n");
	}

	public AgeException(String error) {
		super(error);
	}
}