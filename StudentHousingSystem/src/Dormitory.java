import java.util.*;

public class Dormitory 
{
	public String name;
	int count;
	Inventory storage;
	public List<String> blacklist = new ArrayList<>();
	public List<Student> history = new ArrayList<>();
	public List<Student> curr = new ArrayList<>();
	
	public Dormitory(String name)
	{
		this.name = name;
		storage = new Inventory(1, 1, 1, name);
	}
	
	public String toString()
	{
		return name;
	}
	
	public void getInventory()
	{
		System.out.println(storage);
	}
	
	public void transffer(Student stu, String location)
	{
		stu.setLocation(location);
		curr.remove(stu);
		count++;
	}
	
	public int transfferCount()
	{
		return count;
	}

	public void blackListAdd()
	{
		blacklist.add("Tom Cat/Didn't pay the fee");
		blacklist.add("Jerry Mouse/Smoking");
	}
	
	public void blackList() 
	{
		for(int i=0; i<blacklist.size(); i++)
		{
			System.out.println(blacklist.get(i));
		}
	}

	public void updateInventory(int update, int change)
	{
		if(update == 1)
		{
			storage.setChair(change);
		}
		else if (update == 2)
		{
			storage.setTable(change);
		}
		else
		{
			storage.setBed(change);
		}
	}
	
	public void dormHistory(Student stu)
	{
		history.add(stu);
		curr.add(stu);
	}
	
	public void leaveDorm(Student stu)
	{
		curr.remove(stu);
	}
	
	public void dormRecord()
	{
		System.out.println("past+current record");
		for(int i=0; i<history.size(); i++)
		{
			System.out.println(history.get(i).getName());
		}
		
		System.out.println("Current Student detail");
		for(int i=0; i<curr.size(); i++)
		{
			System.out.println(curr.get(i));
		}
	}
}
