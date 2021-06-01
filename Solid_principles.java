package zemoso_training;


interface Classes
{
	//represents Openclose principle
	void attendClasses();
}

public class Solid_principles {
	public static void main(String[] args) {
		
		Teacher teacher=new Teacher();
		//teacher register
		teacher.register(teacher);
		Attendance attendance=new Attendance();
		BiometricReader biometricReader=new BiometricReader();
		//teacher login
		teacher.checkin(attendance,biometricReader);
		
		//attend class
		teacher.attendClasses();
		
		//correct papers and assign marks
		teacher.correctPapers();
		teacher.assignMarks();
		
		
		Student student =new Student();
		
		//student registration
		student.register(student);
		
		//student login
		student.checkin(attendance,biometricReader);
		
		//attend classes
		student.attendClasses();
		
		//write exams and view marks
		student.writeExam();
		student.viewMarks();
		
	}
	
	

}
