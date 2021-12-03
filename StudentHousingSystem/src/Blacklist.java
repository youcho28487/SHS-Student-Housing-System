public class Blacklist 
{
	Student stu;
	String reason;
	
	public Blacklist(Student stu, String reason)
	{
		this.stu = stu;
		this.reason = reason;
	}
	
	
	public String toString()
	{
		return stu.getName()+" is in the black list becasue "+reason;
	}

}
