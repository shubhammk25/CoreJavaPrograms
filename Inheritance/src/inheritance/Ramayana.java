package inheritance;

public class Ramayana extends Books{
	
	private String Name="ramayana";
	private String Langauge="Sanskrit";
	private String Author="Valmiki";
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
	public Ramayana(int no_of_quantity) {
		super(no_of_quantity);
		
	}
	
	

}
