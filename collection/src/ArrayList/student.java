package ArrayList;

public class student {

		private String Student_name;
		private int id;
		private int std;
		
		public String getStudent_name() {
			return Student_name;
		}
		public void setStudent_name(String student_name) {
			Student_name = student_name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getStd() {
			return std;
		}
		public void setStd(int std) {
			this.std = std;
		}
		public student(String student_name, int id, int std) {
			super();
			Student_name = student_name;
			this.id = id;
			this.std = std;
		}
		
		public String toString()
		{
			return "\n Student Name: "+Student_name+"\n Student Id:"+id+"\nStudent std:"+std;
		}
		
}
