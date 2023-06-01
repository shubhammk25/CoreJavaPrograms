package comparable;

import java.util.Objects;

public class Collage implements Comparable {
	
	String collageName;
	int collageId;
	
	public Collage(String collageName, int collageId) {

		this.collageName = collageName;
		this.collageId = collageId;
	}

		
	public String toString()
	{
		return "collage Name:"+collageName+"\ncollage Id  :"+collageId;
	}
	
	public int comapareTo(Object o)
	{
		Collage c1=(Collage) o;
		return this.collageName.compareTo(c1.collageName);
	}
	
	public boolean equals(Object o)
	{
		Collage c1=(Collage) o;
		return this.collageName.equals(c1.collageName);
	}
	
	public int hashcode()
	{
		return Objects.hash(collageName);
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


}

