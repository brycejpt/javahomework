package chapter9;

public class test1313 {
	public static class Course implements Cloneable{
		private String courseName;
		private String[] students = new String[100];
		private int numberofStudents;
		
		public Course(String courseName) {
			this.courseName=courseName;
		}
		
		public void addStudents(String student) {
			students[numberofStudents] = student;
			numberofStudents++;
		}
		
		public String[] getStudents() {
			return students;
		}
		
		public int getNumberofStudents() {
			return numberofStudents;
		}
		
		public String getCourseName() {
			return courseName;
		}
		
		public void dropStudent(String student) {
			
		}
		
		@Override
		public Object clone() throws CloneNotSupportedException{
			Course courseClone = (Course)super.clone();
			courseClone.students = (String[])(students.clone());
			return courseClone;
		
		
		}
		

		public static void main(String[] args) throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			Course course1 = new Course("java");
			course1.addStudents("s1");
			course1.addStudents("s2");
			course1.addStudents("s3");
			course1.addStudents("s4");
			
			Course course2 = (Course)course1.clone();
			course2.addStudents("s5");
			course2.addStudents("s6");
			course2.addStudents("s7");
			
			System.out.println(course1.getStudents());
			System.out.println(course2.getStudents());
			System.out.println(course1.getNumberofStudents());
			System.out.println(course2.getNumberofStudents());

		}

	}

}
