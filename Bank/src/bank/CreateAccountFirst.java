package bank;

public class CreateAccountFirst  extends RuntimeException{
	
	public String getMessage()
	{
		return "Cannot delete account before creating ";
	}

}
