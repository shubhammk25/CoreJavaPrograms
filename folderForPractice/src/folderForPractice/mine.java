package folderForPractice;

public class mine {

	
	public void compute(int a) throws myException{
		int age =a;
		if(age>150)
		{
			throw new myException(age);
		}
		System.out.println("correct age");
	}
	
	public static void main(String[] args) {
		mine m=new mine();
		try {
			m.compute(1);
			m.compute(149);
		}catch(myException e){
			System.out.println(e);
		}
		
				
	}
}
