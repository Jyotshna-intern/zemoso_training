package zemoso_training;

class BiometricReader
{
	void markYourAttendance()
	{
		System.out.println("Attendace marked");
	}
}
//represents liskov substitution principle
interface Login
{
	void checkin(Attendance attendance,BiometricReader biometricReader);
}


public class Attendance 
{
	BiometricReader biometricReader;
	//dependency inversion principle
	
	public void biometricLogin(BiometricReader biometricReader)
	{
		this.biometricReader=biometricReader;
		biometricReader.markYourAttendance();
	}
	public void signInRegister()
	{
		System.out.println("signed in the register");
	}
}
