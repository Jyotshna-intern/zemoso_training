package zemoso_training;


interface Classes
{
	//represents Openclose principle
	void attendClasses();
}

public class Solid_principles {
	public static void main(String[] args) {
		Attendance attendance=new Attendance();
		BiometricReader biometricReader=new BiometricReader();
		
		Teacher teacher=new Teacher();
		
		teacher.register(teacher);
		
		teacher.checkin(attendance,biometricReader);
		
		teacher.attendClasses();
		
		teacher.correctPapers();
		teacher.assignMarks();
		
		
		Student student =new Student();
		
		student.register(student);
		
		
		student.checkin(attendance,biometricReader);
		
		student.attendClasses();
		
		student.writeExam();
		student.viewMarks();
		
	}
	
	

}
