package inheritance;

public class BhagwatGeeta extends Books {

	private String Name="BhagwatGeeta";
	private String Langauge="Sanskrit";
	private String Author="Vyas";
	public String getName() {
		return Name;
	}
	
	
	public void setName(String name) {
		Name = name;
	}


	public String getLangauge() {
		return Langauge;
	}
	public String getAuthor() {
		return Author;
	}
	public BhagwatGeeta(int no_of_quantity) {
		super(no_of_quantity);
		
	}

	
	
}
