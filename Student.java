package zemoso_training;

public class Student extends user implements Login,Exams,Classes
{
	public void checkin(Attendance a,BiometricReader br)
	{
		a.signInRegister();
	}
	public void attendClasses()
	{
		System.out.println("attending classes");
	}
	
	public void writeExam()
	{
		System.out.println("writing exams is successful");
	}
	public void viewMarks()
	{
		System.out.println("you secured A grade");
	}
}
