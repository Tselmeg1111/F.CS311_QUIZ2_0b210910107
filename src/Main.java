public class Main {
	public static void main (String[] args) {
		
		Course course = new Course ("Software Construction");
		course.setCourseName("Software Construction");
		
		System.out.println(course.courseName);
		System.out.println(course.getCourseName());
		
		course.setCourseName("Program hangamjiin buteelt");
		System.out.println(course.getCourseName());
		
	}

}
