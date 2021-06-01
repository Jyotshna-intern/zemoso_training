package zemoso_training;

public class Teacher extends user implements Login,ExamCorrection,Classes
{
	
	public void checkin(Attendance attendance,BiometricReader biometricReader)
	{
		attendance.biometricLogin(biometricReader);
	}
	
	public void correctPapers()
	{
		System.out.println("papers are corrected");
	}
	public void assignMarks()
	{
		System.out.println("assigning marks is complete");
	}
	
	public void attendClasses()
	{
		System.out.println("Teaching ");
	}
	
}