package folderForPractice;

import java.util.Arrays;

public class myException  extends Exception{
	
	private int e;
	myException(int a)
	{
		e=a;
	}
	@Override
	public String toString() {
		return ("Error in entry"+e);
	}
	
	
}
