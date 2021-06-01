package zemoso_training;

public class user {
	String name,password,id,department;
	//represents single responsibility principle
	public void register(user u)
	{
		this.name="abc";
		this.password="pw";
		this.id="123";
		this.department="cse";
		System.out.println( u.getClass().getSimpleName() +" registered");
	}

}
